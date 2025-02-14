package at.martinthedragon.nucleartech.screen

import at.martinthedragon.nucleartech.LangKeys
import at.martinthedragon.nucleartech.block.entity.ChemPlantBlockEntity
import at.martinthedragon.nucleartech.energy.EnergyFormatter
import at.martinthedragon.nucleartech.menu.ChemPlantMenu
import at.martinthedragon.nucleartech.ntm
import at.martinthedragon.nucleartech.rendering.renderGuiFluidTank
import at.martinthedragon.nucleartech.screen.widgets.UpgradeInfoWidget
import com.mojang.blaze3d.systems.RenderSystem
import com.mojang.blaze3d.vertex.PoseStack
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen
import net.minecraft.client.renderer.GameRenderer
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.TextComponent
import net.minecraft.world.entity.player.Inventory
import net.minecraftforge.fluids.capability.templates.FluidTank

class ChemPlantScreen(menu: ChemPlantMenu, playerInventory: Inventory, title: Component) : AbstractContainerScreen<ChemPlantMenu>(menu, playerInventory, title) {
    private val texture = ntm("textures/gui/chem_plant.png")

    init {
        imageWidth = 176
        imageHeight = 222
        inventoryLabelY = imageHeight - 94
    }

    override fun init() {
        super.init()
        addRenderableWidget(UpgradeInfoWidget(guiLeft + 105, guiTop + 40, 8, 8, menu, this::renderComponentTooltip))
    }

    override fun render(stack: PoseStack, mouseX: Int, mouseY: Int, partialTicks: Float) {
        renderBackground(stack)
        super.render(stack, mouseX, mouseY, partialTicks)
        renderTooltip(stack, mouseX, mouseY)
    }

    override fun renderBg(stack: PoseStack, partialTicks: Float, mouseX: Int, mouseY: Int) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader)
        RenderSystem.setShaderColor(1F, 1F, 1F, 1F)
        RenderSystem.setShaderTexture(0, texture)
        blit(stack, guiLeft, guiTop, 0, 0, xSize, ySize)

        val chemPlant = menu.blockEntity
        val energyScaled = chemPlant.energy * 52 / ChemPlantBlockEntity.MAX_ENERGY
        if (energyScaled > 0) blit(stack, guiLeft + 44, guiTop + 70 - energyScaled, 176, 52 - energyScaled, 16, energyScaled)

        val progressScaled = chemPlant.progress * 90 / chemPlant.maxProgress.coerceAtLeast(1)
        if (progressScaled > 0) blit(stack, guiLeft + 43, guiTop + 89, 0, 222, progressScaled, 18)

        renderGuiFluidTank(stack, guiLeft + 8, guiTop + 52, 16, 34, blitOffset, chemPlant.inputTank1)
        renderGuiFluidTank(stack, guiLeft + 26, guiTop + 52, 16, 34, blitOffset, chemPlant.inputTank2)
        renderGuiFluidTank(stack, guiLeft + 134, guiTop + 52, 16, 34, blitOffset, chemPlant.outputTank1)
        renderGuiFluidTank(stack, guiLeft + 152, guiTop + 52, 16, 34, blitOffset, chemPlant.outputTank2)
    }

    override fun renderTooltip(matrix: PoseStack, mouseX: Int, mouseY: Int) {
        super.renderTooltip(matrix, mouseX, mouseY)

        val chemPlant = menu.blockEntity
        if (isHovering(44, 18, 16, 52, mouseX.toDouble(), mouseY.toDouble())) {
            renderComponentTooltip(matrix,
                listOf(
                    LangKeys.ENERGY.get(),
                    TextComponent("${EnergyFormatter.formatEnergy(chemPlant.energy)}/${EnergyFormatter.formatEnergy(ChemPlantBlockEntity.MAX_ENERGY)} HE")
                ), mouseX, mouseY, font
            )
        }
        if (isHovering(8, 18, 16, 34, mouseX.toDouble(), mouseY.toDouble()))
            renderComponentTooltip(matrix, getTooltipFluidTank(chemPlant.inputTank1), mouseX, mouseY, font)
        if (isHovering(26, 18, 16, 34, mouseX.toDouble(), mouseY.toDouble()))
            renderComponentTooltip(matrix, getTooltipFluidTank(chemPlant.inputTank2), mouseX, mouseY, font)
        if (isHovering(134, 18, 16, 34, mouseX.toDouble(), mouseY.toDouble()))
            renderComponentTooltip(matrix, getTooltipFluidTank(chemPlant.outputTank1), mouseX, mouseY, font)
        if (isHovering(152, 18, 16, 34, mouseX.toDouble(), mouseY.toDouble()))
            renderComponentTooltip(matrix, getTooltipFluidTank(chemPlant.outputTank2), mouseX, mouseY, font)
    }

    private fun getTooltipFluidTank(fluidTank: FluidTank) = listOf(
        fluidTank.fluid.rawFluid.attributes.getDisplayName(fluidTank.fluid),
        TextComponent("${fluidTank.fluidAmount}/${fluidTank.capacity}mB")
    )
}
