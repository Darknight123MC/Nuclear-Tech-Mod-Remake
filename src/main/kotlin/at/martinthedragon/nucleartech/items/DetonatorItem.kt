package at.martinthedragon.nucleartech.items

import at.martinthedragon.nucleartech.*
import at.martinthedragon.nucleartech.api.explosions.IgnitableExplosive
import net.minecraft.core.BlockPos
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.TextComponent
import net.minecraft.network.chat.TranslatableComponent
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag
import net.minecraft.world.item.context.UseOnContext
import net.minecraft.world.level.Level

class DetonatorItem(properties: Properties) : Item(properties) {
    override fun useOn(context: UseOnContext): InteractionResult {
        val player = context.player
        val world = context.level

        if (player != null && player.isSecondaryUseActive) {
            val pos = context.clickedPos
            val block = world.getBlockState(pos)
            if (block.block !is IgnitableExplosive) return InteractionResult.FAIL
            if (!world.isClientSide) {
                val detonatorTag = context.itemInHand.orCreateTag
                detonatorTag.putInt("ExplosivePosX", pos.x)
                detonatorTag.putInt("ExplosivePosY", pos.y)
                detonatorTag.putInt("ExplosivePosZ", pos.z)
            }
            player.playSound(SoundEvents.randomBoop.get(), 2F, 1F)
            if (world.isClientSide) player.displayClientMessage(ntmTranslation("item.position_set").green(), true)
            return InteractionResult.sidedSuccess(world.isClientSide)
        }

        return InteractionResult.PASS
    }

    override fun use(world: Level, player: Player, hand: InteractionHand): InteractionResultHolder<ItemStack> {
        player.playSound(SoundEvents.randomBleep.get(), 1F, 1F)
        val itemStack = player.getItemInHand(hand)
        if (!world.isClientSide) processUse(itemStack, world, player)
        return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide)
    }

    private fun processUse(stack: ItemStack, world: Level, player: Player) {
        if (!isPositionSet(stack)) {
            player.displayClientMessage(TranslatableComponent("$descriptionId.error_position_not_set").red(), true)
            return
        }
        val detonatorTag = stack.orCreateTag
        val posX = detonatorTag.getInt("ExplosivePosX")
        val posY = detonatorTag.getInt("ExplosivePosY")
        val posZ = detonatorTag.getInt("ExplosivePosZ")
        val pos = BlockPos(posX, posY, posZ)
        if (!world.isLoaded(pos)) { // TODO make configurable
            player.displayClientMessage(TranslatableComponent("$descriptionId.error_position_not_loaded").red(), true)
            return
        }
        val block = world.getBlockState(pos).block
        if (block !is IgnitableExplosive) {
            player.displayClientMessage(TranslatableComponent("$descriptionId.error_not_explosive").red(), true)
            return
        }
        val messageToSend = when (block.detonate(world, pos)) {
            IgnitableExplosive.DetonationResult.Success -> TranslatableComponent("$descriptionId.detonation_successful").green()
            IgnitableExplosive.DetonationResult.InvalidPosition -> TranslatableComponent("$descriptionId.error_not_explosive").red()
            IgnitableExplosive.DetonationResult.InvalidBlockEntity -> TranslatableComponent("$descriptionId.error_invalid_tile_entity").red()
            IgnitableExplosive.DetonationResult.Incomplete -> TranslatableComponent("$descriptionId.error_missing_components").red()
            IgnitableExplosive.DetonationResult.Prohibited -> TranslatableComponent("$descriptionId.error_detonation_prohibited").red()
            IgnitableExplosive.DetonationResult.Unknown -> TranslatableComponent("$descriptionId.error_unknown").red()
        }
        player.displayClientMessage(messageToSend, true)
    }

    private fun isPositionSet(stack: ItemStack): Boolean = stack.hasTag() && stack.orCreateTag.contains("ExplosivePosX")

    override fun appendHoverText(stack: ItemStack, worldIn: Level?, tooltip: MutableList<Component>, flagIn: TooltipFlag) {
        autoTooltip(stack, tooltip)
        tooltip += if (isPositionSet(stack)) {
            val tag = stack.orCreateTag
            val x = tag.getInt("ExplosivePosX")
            val y = tag.getInt("ExplosivePosY")
            val z = tag.getInt("ExplosivePosZ")
            TextComponent("$x, $y, $z").gray()
        } else ntmTranslation("item.no_position_set").darkRed()
    }
}
