package at.martinthedragon.nucleartech.entities.missiles

import at.martinthedragon.nucleartech.api.explosions.ExplosionLargeParams
import at.martinthedragon.nucleartech.api.explosions.createAndStart
import at.martinthedragon.nucleartech.entities.EntityTypes
import at.martinthedragon.nucleartech.explosions.ExplosionLarge
import at.martinthedragon.nucleartech.math.burnSphericalFlammable
import net.minecraft.core.BlockPos
import net.minecraft.world.entity.EntityType
import net.minecraft.world.level.Level

class StrongIncendiaryMissile : AbstractMissile {
    constructor(entityType: EntityType<StrongIncendiaryMissile>, level: Level) : super(entityType, level)
    constructor(level: Level, startPos: BlockPos, targetPos: BlockPos) : super(EntityTypes.missileIncendiaryStrong.get(), level, startPos, targetPos)

    override val renderModel = MODEL_MISSILE_STRONG
    override val renderScale = 1.5F

    override fun onImpact() {
        ExplosionLarge.createAndStart(level, position(), 25F, ExplosionLargeParams(fire = true, cloud = true, rubble = true, shrapnel = true))
        burnSphericalFlammable(level, blockPosition(), 20)
        // TODO burn entities
    }
}
