package at.martinthedragon.nucleartech.explosions

import at.martinthedragon.nucleartech.DamageSources
import net.minecraft.entity.Entity
import net.minecraft.entity.EntityType
import net.minecraft.entity.passive.CatEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.nbt.CompoundNBT
import net.minecraft.network.IPacket
import net.minecraft.util.SoundCategory
import net.minecraft.util.SoundEvents
import net.minecraft.util.math.AxisAlignedBB
import net.minecraft.util.math.RayTraceContext
import net.minecraft.util.math.vector.Vector3d
import net.minecraft.world.World
import net.minecraftforge.fml.network.NetworkHooks

class NukeExplosionEntity(entityType: EntityType<NukeExplosionEntity>, world: World) : Entity(entityType, world) {
    var strength = 0
    var speed = 0
    var length = 0
    var isMuted = false
    var hasFallout = true

    // TODO maybe ocean detonations can be made less expensive if the biomes are checked
    private var explosion: NukeExplosionRay? = null

    override fun tick() {
        super.tick()

        if (strength == 0) {
            remove()
            return
        }

        // TODO chunk radiation

        if (!isMuted) {
            level.playSound(null, blockPosition(), SoundEvents.LIGHTNING_BOLT_THUNDER, SoundCategory.AMBIENT, 10000F, .8F + random.nextFloat() * .2F)
            if (random.nextInt(5) == 0)
                level.playSound(null, blockPosition(), SoundEvents.GENERIC_EXPLODE, SoundCategory.AMBIENT, 10000F, .8F + random.nextFloat() * .2F)
        }

        dealDamage(level, position(), (length * 2).toDouble())

        if (explosion == null) explosion = NukeExplosionRay(level, blockPosition(), strength, length)

        when {
            !explosion!!.initialized -> explosion!!.collectTips(speed * 10)
            explosion!!.tipsCount > 0 -> explosion!!.processTips(1024) // TODO config
            hasFallout -> {
                // TODO fallout
                remove()
            }
            else -> remove()
        }
    }

    // TODO client rendering data
    override fun defineSynchedData() {}

    override fun readAdditionalSaveData(nbt: CompoundNBT) {}

    override fun addAdditionalSaveData(nbt: CompoundNBT) {}

    override fun getAddEntityPacket(): IPacket<*> = NetworkHooks.getEntitySpawningPacket(this)

    companion object {
        fun dealDamage(world: World, pos: Vector3d, radius: Double, maxDamage: Float = 250F) {
            val entities = world.getEntities(null,
                AxisAlignedBB(pos.x, pos.y, pos.z, pos.x, pos.y, pos.z).inflate(radius, radius, radius),
                Companion::canExplode
            )

            for (entity in entities) {
                val distance = pos.distanceTo(entity.position())
                if (distance <= radius) {
                    world.clip(RayTraceContext(pos, entity.position(), RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, null))
                    val damage = maxDamage * (radius - distance) /  radius
                    entity.hurt(DamageSources.nuclearBlast, damage.toFloat())
                    entity.setSecondsOnFire(5)

                    val knockBack = Vector3d(
                        entity.x - pos.x,
                        entity.y + entity.eyeHeight - pos.y,
                        entity.z - pos.z
                    ).normalize()

                    entity.deltaMovement = knockBack
                }
            }
        }

        fun canExplode(entity: Entity): Boolean = when {
            entity is PlayerEntity && entity.isCreative -> false
            entity is CatEntity -> false
            else -> true
        }
    }
}
