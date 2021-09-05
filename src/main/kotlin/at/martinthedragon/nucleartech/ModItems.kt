package at.martinthedragon.nucleartech

import at.martinthedragon.nucleartech.RegistriesAndLifecycle.ITEMS
import at.martinthedragon.nucleartech.blocks.FatMan
import at.martinthedragon.nucleartech.entities.EntityTypes
import at.martinthedragon.nucleartech.items.*
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.*
import net.minecraft.util.text.ITextComponent
import net.minecraft.world.World
import net.minecraftforge.fml.RegistryObject

@Suppress("unused")
object ModItems {
    val uraniumIngot: RegistryObject<Item> = ITEMS.register("uranium_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val u233Ingot: RegistryObject<Item> = ITEMS.register("u233_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val u235Ingot: RegistryObject<Item> = ITEMS.register("u235_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val u238Ingot: RegistryObject<Item> = ITEMS.register("u238_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val th232Ingot: RegistryObject<Item> = ITEMS.register("th232_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val plutoniumIngot: RegistryObject<Item> = ITEMS.register("plutonium_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val pu238Ingot: RegistryObject<Item> = ITEMS.register("pu238_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val pu239Ingot: RegistryObject<Item> = ITEMS.register("pu239_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val pu240Ingot: RegistryObject<Item> = ITEMS.register("pu240_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val neptuniumIngot: RegistryObject<Item> = ITEMS.register("neptunium_ingot") { object : EffectItem(listOf(EffectTypes.Radioactive), Properties().tab(CreativeTabs.Parts), 2.5f) {
        override fun appendHoverText(stack: ItemStack, worldIn: World?, tooltip: MutableList<ITextComponent>, flagIn: ITooltipFlag) {
            autoTooltip(stack, tooltip)
            super.appendHoverText(stack, worldIn, tooltip, flagIn)
        }
    }}
    val poloniumIngot: RegistryObject<Item> = ITEMS.register("polonium_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val titaniumIngot: RegistryObject<Item> = ITEMS.register("titanium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperIngot: RegistryObject<Item> = ITEMS.register("copper_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redCopperIngot: RegistryObject<Item> = ITEMS.register("red_copper_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedAlloyIngot: RegistryObject<Item> = ITEMS.register("advanced_alloy_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenIngot: RegistryObject<Item> = ITEMS.register("tungsten_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumIngot: RegistryObject<Item> = ITEMS.register("aluminium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelIngot: RegistryObject<Item> = ITEMS.register("steel_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadIngot: RegistryObject<Item> = ITEMS.register("lead_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val berylliumIngot: RegistryObject<Item> = ITEMS.register("beryllium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val cobaltIngot: RegistryObject<Item> = ITEMS.register("cobalt_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highSpeedSteelIngot: RegistryObject<Item> = ITEMS.register("high_speed_steel_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val polymerIngot: RegistryObject<Item> = ITEMS.register("polymer_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schraraniumIngot: RegistryObject<Item> = ITEMS.register("schraranium_ingot") { object : EffectItem(listOf(EffectTypes.Radioactive, EffectTypes.Blinding), Properties().tab(CreativeTabs.Parts), 2.5f) {
        override fun appendHoverText(stack: ItemStack, worldIn: World?, tooltip: MutableList<ITextComponent>, flagIn: ITooltipFlag) {
            autoTooltip(stack, tooltip)
            super.appendHoverText(stack, worldIn, tooltip, flagIn)
        }
    }}
    val schrabidiumIngot: RegistryObject<Item> = ITEMS.register("schrabidium_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.RARE), 7.5f) }
    val magnetizedTungstenIngot: RegistryObject<Item> = ITEMS.register("magnetized_tungsten_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val combineSteelIngot: RegistryObject<Item> = ITEMS.register("combine_steel_ingot") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val soliniumIngot: RegistryObject<Item> = ITEMS.register("solinium_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 7.5f) }
    val uraniumFuelIngot: RegistryObject<Item> = ITEMS.register("uranium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 3.5f) }
    val thoriumFuelIngot: RegistryObject<Item> = ITEMS.register("thorium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val plutoniumFuelIngot: RegistryObject<Item> = ITEMS.register("plutonium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 3.5f) }
    val moxFuelIngot: RegistryObject<Item> = ITEMS.register("mox_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 3.5f) }
    val schrabidiumFuelIngot: RegistryObject<Item> = ITEMS.register("schrabidium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val highEnrichedSchrabidiumFuelIngot: RegistryObject<Item> = ITEMS.register("high_enriched_schrabidium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 7.5f) }
    val lowEnrichedSchrabidiumFuelIngot: RegistryObject<Item> = ITEMS.register("low_enriched_schrabidium_fuel_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val australiumIngot: RegistryObject<Item> = ITEMS.register("australium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val weidaniumIngot: RegistryObject<Item> = ITEMS.register("weidanium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val reiiumIngot: RegistryObject<Item> = ITEMS.register("reiium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val unobtainiumIngot: RegistryObject<Item> = ITEMS.register("unobtainium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val daffergonIngot: RegistryObject<Item> = ITEMS.register("daffergon_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val verticiumIngot: RegistryObject<Item> = ITEMS.register("verticium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val lanthanumIngot: RegistryObject<Item> = ITEMS.register("lanthanum_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val actiniumIngot: RegistryObject<Item> = ITEMS.register("actinium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshIngot: RegistryObject<Item> = ITEMS.register("desh_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val starmetalIngot: RegistryObject<Item> = ITEMS.register("starmetal_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val saturniteIngot: RegistryObject<Item> = ITEMS.register("saturnite_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.RARE)) }
    val euphemiumIngot: RegistryObject<Item> = ITEMS.register("euphemium_ingot") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val dineutroniumIngot: RegistryObject<Item> = ITEMS.register("dineutronium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val electroniumIngot: RegistryObject<Item> = ITEMS.register("electronium_ingot") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val whitePhosphorusIngot: RegistryObject<Item> = ITEMS.register("white_phosphorus_ingot") { EffectItem(listOf(EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts)) }
    val semtexBar: RegistryObject<Item> = ITEMS.register("semtex_bar") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts).food(Food.Builder().nutrition(4).saturationMod(0.5f).build())) }
    val lithiumCube: RegistryObject<Item> = ITEMS.register("lithium_cube") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val solidFuelCube: RegistryObject<Item> = ITEMS.register("solid_fuel_cube") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val solidRocketFuelCube: RegistryObject<Item> = ITEMS.register("solid_rocket_fuel_cube") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val fiberglassSheet: RegistryObject<Item> = ITEMS.register("fiberglass_sheet") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val asbestosSheet: RegistryObject<Item> = ITEMS.register("asbestos_sheet") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val mercuryDroplet: RegistryObject<Item> = ITEMS.register("mercury_droplet") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mercuryBottle: RegistryObject<Item> = ITEMS.register("mercury_bottle") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val coke: RegistryObject<Item> = ITEMS.register("coke") { object : Item(Properties().tab(CreativeTabs.Parts)) {
        override fun getBurnTime(itemStack: ItemStack?) = 3200
    }}
    val lignite: RegistryObject<Item> = ITEMS.register("lignite") { object : Item(Properties().tab(CreativeTabs.Parts)) {
        override fun getBurnTime(itemStack: ItemStack?) = 1200
    }}
    val ligniteBriquette: RegistryObject<Item> = ITEMS.register("lignite_briquette") { object : Item(Properties().tab(CreativeTabs.Parts)) {
        override fun getBurnTime(itemStack: ItemStack?) = 1600
    }}
    val sulfur: RegistryObject<Item> = ITEMS.register("sulfur") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val niter: RegistryObject<Item> = ITEMS.register("niter") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val fluorite: RegistryObject<Item> = ITEMS.register("fluorite") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val coalPowder: RegistryObject<Item> = ITEMS.register("coal_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ironPowder: RegistryObject<Item> = ITEMS.register("iron_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldPowder: RegistryObject<Item> = ITEMS.register("gold_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val lapisLazuliPowder: RegistryObject<Item> = ITEMS.register("lapis_lazuli_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val quartzPowder: RegistryObject<Item> = ITEMS.register("quartz_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val diamondPowder: RegistryObject<Item> = ITEMS.register("diamond_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val emeraldPowder: RegistryObject<Item> = ITEMS.register("emerald_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val uraniumPowder: RegistryObject<Item> = ITEMS.register("uranium_powder") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val thoriumPowder: RegistryObject<Item> = ITEMS.register("thorium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val plutoniumPowder: RegistryObject<Item> = ITEMS.register("plutonium_powder") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val neptuniumPowder: RegistryObject<Item> = ITEMS.register("neptunium_powder") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC), 2.5f) }
    val poloniumPowder: RegistryObject<Item> = ITEMS.register("polonium_powder") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val titaniumPowder: RegistryObject<Item> = ITEMS.register("titanium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperPowder: RegistryObject<Item> = ITEMS.register("copper_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redCopperPowder: RegistryObject<Item> = ITEMS.register("red_copper_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedAlloyPowder: RegistryObject<Item> = ITEMS.register("advanced_alloy_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenPowder: RegistryObject<Item> = ITEMS.register("tungsten_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumPowder: RegistryObject<Item> = ITEMS.register("aluminium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelPowder: RegistryObject<Item> = ITEMS.register("steel_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadPowder: RegistryObject<Item> = ITEMS.register("lead_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val yellowcake: RegistryObject<Item> = ITEMS.register("yellowcake") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val berylliumPowder: RegistryObject<Item> = ITEMS.register("beryllium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highSpeedSteelPowder: RegistryObject<Item> = ITEMS.register("high_speed_steel_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val polymerPowder: RegistryObject<Item> = ITEMS.register("polymer_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schrabidiumPowder: RegistryObject<Item> = ITEMS.register("schrabidium_powder") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.RARE), 7.5f) }
    val magnetizedTungstenPowder: RegistryObject<Item> = ITEMS.register("magnetized_tungsten_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val chlorophytePowder: RegistryObject<Item> = ITEMS.register("chlorophyte_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val combineSteelPowder: RegistryObject<Item> = ITEMS.register("combine_steel_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val lithiumPowder: RegistryObject<Item> = ITEMS.register("lithium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val lignitePowder: RegistryObject<Item> = ITEMS.register("lignite_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val neodymiumPowder: RegistryObject<Item> = ITEMS.register("neodymium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val australiumPowder: RegistryObject<Item> = ITEMS.register("australium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val weidaniumPowder: RegistryObject<Item> = ITEMS.register("weidanium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val reiiumPowder: RegistryObject<Item> = ITEMS.register("reiium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val unobtainiumPowder: RegistryObject<Item> = ITEMS.register("unobtainium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val daffergonPowder: RegistryObject<Item> = ITEMS.register("daffergon_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val verticiumPowder: RegistryObject<Item> = ITEMS.register("verticium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val cobaltPowder: RegistryObject<Item> = ITEMS.register("cobalt_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val niobiumPowder: RegistryObject<Item> = ITEMS.register("niobium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val ceriumPowder: RegistryObject<Item> = ITEMS.register("cerium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val lanthanumPowder: RegistryObject<Item> = ITEMS.register("lanthanum_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val actiniumPowder: RegistryObject<Item> = ITEMS.register("actinium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val asbestosPowder: RegistryObject<Item> = ITEMS.register("asbestos_powder") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val enchantmentPowder: RegistryObject<Item> = ITEMS.register("enchantment_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val cloudResidue: RegistryObject<Item> = ITEMS.register("cloud_residue") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val thermonuclearAshes: RegistryObject<Item> = ITEMS.register("thermonuclear_ashes") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 500f) }
    val semtexMix: RegistryObject<Item> = ITEMS.register("semtex_mix") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshMix: RegistryObject<Item> = ITEMS.register("desh_mix") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshReadyMix: RegistryObject<Item> = ITEMS.register("desh_ready_mix") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshPowder: RegistryObject<Item> = ITEMS.register("desh_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val nitaniumMix: RegistryObject<Item> = ITEMS.register("nitanium_mix") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val sparkMix: RegistryObject<Item> = ITEMS.register("spark_mix") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val meteoritePowder: RegistryObject<Item> = ITEMS.register("meteorite_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val euphemiumPowder: RegistryObject<Item> = ITEMS.register("euphemium_powder") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val dineutroniumPowder: RegistryObject<Item> = ITEMS.register("dineutronium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val desaturatedRedstone: RegistryObject<Item> = ITEMS.register("desaturated_redstone") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val dust: RegistryObject<Item> = ITEMS.register("dust") { object : AutoTooltippedItem(Properties().tab(CreativeTabs.Parts)) {
        override fun getBurnTime(itemStack: ItemStack?) = 400
    }}
    val tinyLithiumPowder: RegistryObject<Item> = ITEMS.register("tiny_lithium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyNeodymiumPowder: RegistryObject<Item> = ITEMS.register("tiny_neodymium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyCobaltPowder: RegistryObject<Item> = ITEMS.register("tiny_cobalt_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyNiobiumPowder: RegistryObject<Item> = ITEMS.register("tiny_niobium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyCeriumPowder: RegistryObject<Item> = ITEMS.register("tiny_cerium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyLanthanumPowder: RegistryObject<Item> = ITEMS.register("tiny_lanthanum_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyActiniumPowder: RegistryObject<Item> = ITEMS.register("tiny_actinium_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tinyMeteoritePowder: RegistryObject<Item> = ITEMS.register("tiny_meteorite_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redPhosphorus: RegistryObject<Item> = ITEMS.register("red_phosphorus") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val cryoPowder: RegistryObject<Item> = ITEMS.register("cryo_powder") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val poisonPowder: RegistryObject<Item> = ITEMS.register("poison_powder") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val thermite: RegistryObject<Item> = ITEMS.register("thermite") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val energyPowder: RegistryObject<Item> = ITEMS.register("energy_powder") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val cordite: RegistryObject<Item> = ITEMS.register("cordite") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ballistite: RegistryObject<Item> = ITEMS.register("ballistite") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ironCrystals: RegistryObject<Item> = ITEMS.register("iron_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldCrystals: RegistryObject<Item> = ITEMS.register("gold_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redstoneCrystals: RegistryObject<Item> = ITEMS.register("redstone_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val diamondCrystals: RegistryObject<Item> = ITEMS.register("diamond_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val uraniumCrystals: RegistryObject<Item> = ITEMS.register("uranium_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .75f) }
    val thoriumCrystals: RegistryObject<Item> = ITEMS.register("thorium_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val plutoniumCrystals: RegistryObject<Item> = ITEMS.register("plutonium_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 3f) }
    val titaniumCrystals: RegistryObject<Item> = ITEMS.register("titanium_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val sulfurCrystals: RegistryObject<Item> = ITEMS.register("sulfur_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val niterCrystals: RegistryObject<Item> = ITEMS.register("niter_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperCrystals: RegistryObject<Item> = ITEMS.register("copper_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenCrystals: RegistryObject<Item> = ITEMS.register("tungsten_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumCrystals: RegistryObject<Item> = ITEMS.register("aluminium_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val fluoriteCrystals: RegistryObject<Item> = ITEMS.register("fluorite_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val berylliumCrystals: RegistryObject<Item> = ITEMS.register("beryllium_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadCrystals: RegistryObject<Item> = ITEMS.register("lead_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schraraniumCrystals: RegistryObject<Item> = ITEMS.register("schraranium_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 5f) }
    val schrabidiumCrystals: RegistryObject<Item> = ITEMS.register("schrabidium_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val rareEarthCrystals: RegistryObject<Item> = ITEMS.register("rare_earth_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redPhosphorusCrystals: RegistryObject<Item> = ITEMS.register("red_phosphorus_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts)) }
    val lithiumCrystals: RegistryObject<Item> = ITEMS.register("lithium_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val starmetalCrystals: RegistryObject<Item> = ITEMS.register("starmetal_crystals") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val trixiteCrystals: RegistryObject<Item> = ITEMS.register("trixite_crystals") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val neodymiumFragment: RegistryObject<Item> = ITEMS.register("neodymium_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val cobaltFragment: RegistryObject<Item> = ITEMS.register("cobalt_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val niobiumFragment: RegistryObject<Item> = ITEMS.register("niobium_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ceriumFragment: RegistryObject<Item> = ITEMS.register("cerium_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val lanthanumFragment: RegistryObject<Item> = ITEMS.register("lanthanum_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val actiniumFragment: RegistryObject<Item> = ITEMS.register("actinium_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val meteoriteFragment: RegistryObject<Item> = ITEMS.register("meteorite_fragment") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val biomass: RegistryObject<Item> = ITEMS.register("biomass") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val compressedBiomass: RegistryObject<Item> = ITEMS.register("compressed_biomass") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val uraniumNugget: RegistryObject<Item> = ITEMS.register("uranium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .25f) }
    val u233Nugget: RegistryObject<Item> = ITEMS.register("u233_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val u235Nugget: RegistryObject<Item> = ITEMS.register("u235_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val u238Nugget: RegistryObject<Item> = ITEMS.register("u238_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .25f) }
    val th232Nugget: RegistryObject<Item> = ITEMS.register("th232_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val plutoniumNugget: RegistryObject<Item> = ITEMS.register("plutonium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val pu238Nugget: RegistryObject<Item> = ITEMS.register("pu238_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .25f) }
    val pu239Nugget: RegistryObject<Item> = ITEMS.register("pu239_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val pu240Nugget: RegistryObject<Item> = ITEMS.register("pu240_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val neptuniumNugget: RegistryObject<Item> = ITEMS.register("neptunium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val poloniumNugget: RegistryObject<Item> = ITEMS.register("polonium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 3.5f) }
    val leadNugget: RegistryObject<Item> = ITEMS.register("lead_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val berylliumNugget: RegistryObject<Item> = ITEMS.register("beryllium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schrabidiumNugget: RegistryObject<Item> = ITEMS.register("schrabidium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.RARE), 2.5f) }
    val soliniumNugget: RegistryObject<Item> = ITEMS.register("solinium_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val uraniumFuelNugget: RegistryObject<Item> = ITEMS.register("uranium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val thoriumFuelNugget: RegistryObject<Item> = ITEMS.register("thorium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .025f) }
    val plutoniumFuelNugget: RegistryObject<Item> = ITEMS.register("plutonium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1f) }
    val moxFuelNugget: RegistryObject<Item> = ITEMS.register("mox_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1f) }
    val schrabidiumFuelNugget: RegistryObject<Item> = ITEMS.register("schrabidium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 1.5f) }
    val highEnrichedSchrabidiumFuelNugget: RegistryObject<Item> = ITEMS.register("high_enriched_schrabidium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 2.5f) }
    val lowEnrichedSchrabidiumFuelNugget: RegistryObject<Item> = ITEMS.register("low_enriched_schrabidium_fuel_nugget") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val australiumNugget: RegistryObject<Item> = ITEMS.register("australium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val weidaniumNugget: RegistryObject<Item> = ITEMS.register("weidanium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val reiiumNugget: RegistryObject<Item> = ITEMS.register("reiium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val unobtainiumNugget: RegistryObject<Item> = ITEMS.register("unobtainium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val daffergonNugget: RegistryObject<Item> = ITEMS.register("daffergon_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val verticiumNugget: RegistryObject<Item> = ITEMS.register("verticium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.UNCOMMON)) }
    val deshNugget: RegistryObject<Item> = ITEMS.register("desh_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val euphemiumNugget: RegistryObject<Item> = ITEMS.register("euphemium_nugget") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.EPIC)) }
    val dineutroniumNugget: RegistryObject<Item> = ITEMS.register("dineutronium_nugget") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ironPlate: RegistryObject<Item> = ITEMS.register("iron_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldPlate: RegistryObject<Item> = ITEMS.register("gold_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val titaniumPlate: RegistryObject<Item> = ITEMS.register("titanium_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumPlate: RegistryObject<Item> = ITEMS.register("aluminium_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelPlate: RegistryObject<Item> = ITEMS.register("steel_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadPlate: RegistryObject<Item> = ITEMS.register("lead_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperPlate: RegistryObject<Item> = ITEMS.register("copper_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedAlloyPlate: RegistryObject<Item> = ITEMS.register("advanced_alloy_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val neutronReflector: RegistryObject<Item> = ITEMS.register("neutron_reflector") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schrabidiumPlate: RegistryObject<Item> = ITEMS.register("schrabidium_plate") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 7.5f) }
    val combineSteelPlate: RegistryObject<Item> = ITEMS.register("combine_steel_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mixedPlate: RegistryObject<Item> = ITEMS.register("mixed_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val saturnitePlate: RegistryObject<Item> = ITEMS.register("saturnite_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val paAAlloyPlate: RegistryObject<Item> = ITEMS.register("paa_alloy_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val insulator: RegistryObject<Item> = ITEMS.register("insulator") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val kevlarCeramicCompound: RegistryObject<Item> = ITEMS.register("kevlar_ceramic_compound") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val dalekaniumPlate: RegistryObject<Item> = ITEMS.register("angry_metal") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshCompoundPlate: RegistryObject<Item> = ITEMS.register("desh_compound_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val euphemiumCompoundPlate: RegistryObject<Item> = ITEMS.register("euphemium_compound_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val dineutroniumCompoundPlate: RegistryObject<Item> = ITEMS.register("dineutronium_compound_plate") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperPanel: RegistryObject<Item> = ITEMS.register("copper_panel") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highSpeedSteelBolt: RegistryObject<Item> = ITEMS.register("high_speed_steel_bolt") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenBolt: RegistryObject<Item> = ITEMS.register("tungsten_bolt") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val reinforcedTurbineShaft: RegistryObject<Item> = ITEMS.register("reinforced_turbine_shaft") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hazmatCloth: RegistryObject<Item> = ITEMS.register("hazmat_cloth") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedHazmatCloth: RegistryObject<Item> = ITEMS.register("advanced_hazmat_cloth") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadReinforcedHazmatCloth: RegistryObject<Item> = ITEMS.register("lead_reinforced_hazmat_cloth") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val fireProximityCloth: RegistryObject<Item> = ITEMS.register("fire_proximity_cloth") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val activatedCarbonFilter: RegistryObject<Item> = ITEMS.register("activated_carbon_filter") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumWire: RegistryObject<Item> = ITEMS.register("aluminium_wire") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperWire: RegistryObject<Item> = ITEMS.register("copper_wire") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenWire: RegistryObject<Item> = ITEMS.register("tungsten_wire") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val redCopperWire: RegistryObject<Item> = ITEMS.register("red_copper_wire") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val superConductor: RegistryObject<Item> = ITEMS.register("super_conductor") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldWire: RegistryObject<Item> = ITEMS.register("gold_wire") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schrabidiumWire: RegistryObject<Item> = ITEMS.register("schrabidium_wire") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), .5f) }
    val highTemperatureSuperConductor: RegistryObject<Item> = ITEMS.register("high_temperature_super_conductor") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val copperCoil: RegistryObject<Item> = ITEMS.register("copper_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ringCoil: RegistryObject<Item> = ITEMS.register("ring_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val superConductingCoil: RegistryObject<Item> = ITEMS.register("super_conducting_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val superConductingRingCoil: RegistryObject<Item> = ITEMS.register("super_conducting_ring_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldCoil: RegistryObject<Item> = ITEMS.register("gold_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldRingCoil: RegistryObject<Item> = ITEMS.register("gold_ring_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val heatingCoil: RegistryObject<Item> = ITEMS.register("heating_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highTemperatureSuperConductingCoil: RegistryObject<Item> = ITEMS.register("high_temperature_super_conducting_coil") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelTank: RegistryObject<Item> = ITEMS.register("steel_tank") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val motor: RegistryObject<Item> = ITEMS.register("motor") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val centrifugeElement: RegistryObject<Item> = ITEMS.register("centrifuge_element") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val centrifugeTower: RegistryObject<Item> = ITEMS.register("centrifuge_tower") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deeMagnets: RegistryObject<Item> = ITEMS.register("dee_magnets") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val flatMagnet: RegistryObject<Item> = ITEMS.register("flat_magnet") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val cyclotronTower: RegistryObject<Item> = ITEMS.register("cyclotron_tower") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val breedingReactorCore: RegistryObject<Item> = ITEMS.register("breeding_reactor_core") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val rtgUnit: RegistryObject<Item> = ITEMS.register("rtg_unit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val thermalDistributionUnit: RegistryObject<Item> = ITEMS.register("thermal_distribution_unit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val endothermicDistributionUnit: RegistryObject<Item> = ITEMS.register("endothermic_distribution_unit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val exothermicDistributionUnit: RegistryObject<Item> = ITEMS.register("exothermic_distribution_unit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val gravityManipulator: RegistryObject<Item> = ITEMS.register("gravity_manipulator") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelPipes: RegistryObject<Item> = ITEMS.register("steel_pipes") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val titaniumDrill: RegistryObject<Item> = ITEMS.register("titanium_drill") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val photovoltaicPanel: RegistryObject<Item> = ITEMS.register("photovoltaic_panel") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val chlorinePinwheel: RegistryObject<Item> = ITEMS.register("chlorine_pinwheel") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val telepad: RegistryObject<Item> = ITEMS.register("telepad") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val entanglementKit: RegistryObject<Item> = ITEMS.register("entanglement_kit") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val stabilizerComponent: RegistryObject<Item> = ITEMS.register("stabilizer_component") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val emitterComponent: RegistryObject<Item> = ITEMS.register("emitter_component") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val aluminiumCap: RegistryObject<Item> = ITEMS.register("aluminium_cap") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallSteelShell: RegistryObject<Item> = ITEMS.register("small_steel_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallAluminiumShell: RegistryObject<Item> = ITEMS.register("small_aluminium_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val bigSteelShell: RegistryObject<Item> = ITEMS.register("big_steel_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val bigAluminiumShell: RegistryObject<Item> = ITEMS.register("big_aluminium_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val bigTitaniumShell: RegistryObject<Item> = ITEMS.register("big_titanium_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val flatSteelCasing: RegistryObject<Item> = ITEMS.register("flat_steel_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallSteelGridFins: RegistryObject<Item> = ITEMS.register("small_steel_grid_fins") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val bigSteelGridFins: RegistryObject<Item> = ITEMS.register("big_steel_grid_fins") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeSteelFins: RegistryObject<Item> = ITEMS.register("large_steel_fins") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallTitaniumFins: RegistryObject<Item> = ITEMS.register("small_titanium_fins") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelSphere: RegistryObject<Item> = ITEMS.register("steel_sphere") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val steelPedestal: RegistryObject<Item> = ITEMS.register("steel_pedestal") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val dysfunctionalNuclearReactor: RegistryObject<Item> = ITEMS.register("dysfunctional_nuclear_reactor") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeSteelRotor: RegistryObject<Item> = ITEMS.register("large_steel_rotor") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val generatorBody: RegistryObject<Item> = ITEMS.register("generator_body") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val titaniumBlade: RegistryObject<Item> = ITEMS.register("titanium_blade") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val tungstenReinforcedBlade: RegistryObject<Item> = ITEMS.register("tungsten_reinforced_blade") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val titaniumSteamTurbine: RegistryObject<Item> = ITEMS.register("titanium_steam_turbine") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val reinforcedTurbofanBlades: RegistryObject<Item> = ITEMS.register("reinforced_turbofan_blades") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val generatorFront: RegistryObject<Item> = ITEMS.register("generator_front") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val toothpicks: RegistryObject<Item> = ITEMS.register("toothpicks") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ductTape: RegistryObject<Item> = ITEMS.register("duct_tape") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val clayCatalyst: RegistryObject<Item> = ITEMS.register("clay_catalyst") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallMissileAssembly: RegistryObject<Item> = ITEMS.register("small_missile_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallWarhead: RegistryObject<Item> = ITEMS.register("small_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumWarhead: RegistryObject<Item> = ITEMS.register("medium_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeWarhead: RegistryObject<Item> = ITEMS.register("large_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallIncendiaryWarhead: RegistryObject<Item> = ITEMS.register("small_incendiary_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumIncendiaryWarhead: RegistryObject<Item> = ITEMS.register("medium_incendiary_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeIncendiaryWarhead: RegistryObject<Item> = ITEMS.register("large_incendiary_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallClusterWarhead: RegistryObject<Item> = ITEMS.register("small_cluster_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumClusterWarhead: RegistryObject<Item> = ITEMS.register("medium_cluster_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeClusterWarhead: RegistryObject<Item> = ITEMS.register("large_cluster_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallBunkerBusterWarhead: RegistryObject<Item> = ITEMS.register("small_bunker_busting_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumBunkerBusterWarhead: RegistryObject<Item> = ITEMS.register("medium_bunker_busting_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeBunkerBusterWarhead: RegistryObject<Item> = ITEMS.register("large_bunker_busting_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val nuclearWarhead: RegistryObject<Item> = ITEMS.register("nuclear_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val thermonuclearWarhead: RegistryObject<Item> = ITEMS.register("thermonuclear_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val endothermicWarhead: RegistryObject<Item> = ITEMS.register("endothermic_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val exothermicWarhead: RegistryObject<Item> = ITEMS.register("exothermic_warhead") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallFuelTank: RegistryObject<Item> = ITEMS.register("small_fuel_tank") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumFuelTank: RegistryObject<Item> = ITEMS.register("medium_fuel_tank") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeFuelTank: RegistryObject<Item> = ITEMS.register("large_fuel_tank") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallThruster: RegistryObject<Item> = ITEMS.register("small_thruster") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val mediumThruster: RegistryObject<Item> = ITEMS.register("medium_thruster") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeThruster: RegistryObject<Item> = ITEMS.register("large_thruster") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val lvnNuclearRocketEngine: RegistryObject<Item> = ITEMS.register("lv_n_nuclear_rocket_engine") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val satelliteBase: RegistryObject<Item> = ITEMS.register("satellite_base") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highGainOpticalCamera: RegistryObject<Item> = ITEMS.register("high_gain_optical_camera") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val m700SurveyScanner: RegistryObject<Item> = ITEMS.register("m700_survey_scanner") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val radarDish: RegistryObject<Item> = ITEMS.register("radar_dish") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deathRay: RegistryObject<Item> = ITEMS.register("death_ray") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val xeniumResonator: RegistryObject<Item> = ITEMS.register("xenium_resonator") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val size10Connector: RegistryObject<Item> = ITEMS.register("size_10_connector") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val size15Connector: RegistryObject<Item> = ITEMS.register("size_15_connector") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val size20Connector: RegistryObject<Item> = ITEMS.register("size_20_connector") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hunterChopperCockpit: RegistryObject<Item> = ITEMS.register("hunter_chopper_cockpit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val emplacementGun: RegistryObject<Item> = ITEMS.register("emplacement_gun") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hunterChopperBody: RegistryObject<Item> = ITEMS.register("hunter_chopper_body") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hunterChopperTail: RegistryObject<Item> = ITEMS.register("hunter_chopper_tail") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hunterChopperWing: RegistryObject<Item> = ITEMS.register("hunter_chopper_wing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val hunterChopperRotorBlades: RegistryObject<Item> = ITEMS.register("hunter_chopper_rotor_blades") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val combineScrapMetal: RegistryObject<Item> = ITEMS.register("combine_scrap_metal") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val heavyHammerHead: RegistryObject<Item> = ITEMS.register("heavy_hammer_head") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val heavyAxeHead: RegistryObject<Item> = ITEMS.register("heavy_axe_head") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val reinforcedPolymerHandle: RegistryObject<Item> = ITEMS.register("reinforced_polymer_handle") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val basicCircuitAssembly: RegistryObject<Item> = ITEMS.register("basic_circuit_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val basicCircuit: RegistryObject<Item> = ITEMS.register("basic_circuit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val enhancedCircuit: RegistryObject<Item> = ITEMS.register("enhanced_circuit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedCircuit: RegistryObject<Item> = ITEMS.register("advanced_circuit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val overclockedCircuit: RegistryObject<Item> = ITEMS.register("overclocked_circuit") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highPerformanceCircuit: RegistryObject<Item> = ITEMS.register("high_performance_circuit") { Item(Item.Properties().tab(CreativeTabs.Parts).rarity(Rarity.RARE)) }
    val militaryGradeCircuitBoardTier1: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_1") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val militaryGradeCircuitBoardTier2: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_2") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val militaryGradeCircuitBoardTier3: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_3") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val militaryGradeCircuitBoardTier4: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_4") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val militaryGradeCircuitBoardTier5: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_5") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val militaryGradeCircuitBoardTier6: RegistryObject<Item> = ITEMS.register("military_grade_circuit_board_tier_6") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val revolverMechanism: RegistryObject<Item> = ITEMS.register("revolver_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedRevolverMechanism: RegistryObject<Item> = ITEMS.register("advanced_revolver_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val rifleMechanism: RegistryObject<Item> = ITEMS.register("rifle_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedRifleMechanism: RegistryObject<Item> = ITEMS.register("advanced_rifle_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val launcherMechanism: RegistryObject<Item> = ITEMS.register("launcher_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val advancedLauncherMechanism: RegistryObject<Item> = ITEMS.register("advanced_launcher_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val highTechWeaponMechanism: RegistryObject<Item> = ITEMS.register("high_tech_weapon_mechanism") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point357MagnumPrimer: RegistryObject<Item> = ITEMS.register("point_357_magnum_primer") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point44MagnumPrimer: RegistryObject<Item> = ITEMS.register("point_44_magnum_primer") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallCaliberPrimer: RegistryObject<Item> = ITEMS.register("small_caliber_primer") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeCaliberPrimer: RegistryObject<Item> = ITEMS.register("large_caliber_primer") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val buckshotPrimer: RegistryObject<Item> = ITEMS.register("buckshot_primer") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point357MagnumCasing: RegistryObject<Item> = ITEMS.register("point_357_magnum_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point44MagnumCasing: RegistryObject<Item> = ITEMS.register("point_44_magnum_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val smallCaliberCasing: RegistryObject<Item> = ITEMS.register("small_caliber_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val largeCaliberCasing: RegistryObject<Item> = ITEMS.register("large_caliber_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val buckshotCasing: RegistryObject<Item> = ITEMS.register("buckshot_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val ironBulletAssembly: RegistryObject<Item> = ITEMS.register("iron_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadBulletAssembly: RegistryObject<Item> = ITEMS.register("lead_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val glassBulletAssembly: RegistryObject<Item> = ITEMS.register("glass_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val goldBulletAssembly: RegistryObject<Item> = ITEMS.register("gold_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val schrabidiumBulletAssembly: RegistryObject<Item> = ITEMS.register("schrabidium_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val nightmareBulletAssembly: RegistryObject<Item> = ITEMS.register("nightmare_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val deshBulletAssembly: RegistryObject<Item> = ITEMS.register("desh_bullet_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point44MagnumAssembly: RegistryObject<Item> = ITEMS.register("point_44_magnum_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val nineMmAssembly: RegistryObject<Item> = ITEMS.register("9_mm_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val fivePoint56mmAssembly: RegistryObject<Item> = ITEMS.register("5_point_56_mm_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point22LRAssembly: RegistryObject<Item> = ITEMS.register("point_22_lr_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point5mmAssembly: RegistryObject<Item> = ITEMS.register("point_5_mm_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point50AEAssembly: RegistryObject<Item> = ITEMS.register("point_50_ae_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val point50BMGAssembly: RegistryObject<Item> = ITEMS.register("point_50_bmg_assembly") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val silverBulletCasing: RegistryObject<Item> = ITEMS.register("silver_bullet_casing") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val twelvePoint8cmStarmetalHighEnergyShell: RegistryObject<Item> = ITEMS.register("12_point_8_cm_starmetal_high_energy_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val twelvePoint8cmNuclearShell: RegistryObject<Item> = ITEMS.register("12_point_8_cm_nuclear_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val twelvePoint8cmDUShell: RegistryObject<Item> = ITEMS.register("12_point_8_cm_du_shell") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val cableDrum: RegistryObject<Item> = ITEMS.register("cable_drum") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val paintingOfACartoonPony: RegistryObject<Item> = ITEMS.register("painting_of_a_cartoon_pony") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val conspiracyTheory: RegistryObject<Item> = ITEMS.register("conspiracy_theory") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val politicalTopic: RegistryObject<Item> = ITEMS.register("political_topic") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val ownOpinion: RegistryObject<Item> = ITEMS.register("own_opinion") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val explosivePellets: RegistryObject<Item> = ITEMS.register("explosive_pellets") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val leadPellets: RegistryObject<Item> = ITEMS.register("lead_pellets") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val flechettes: RegistryObject<Item> = ITEMS.register("flechettes") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val poisonGasCartridge: RegistryObject<Item> = ITEMS.register("poison_gas_cartridge") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val magnetron: RegistryObject<Item> = ITEMS.register("magnetron") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val denseCoalCluster: RegistryObject<Item> = ITEMS.register("dense_coal_cluster") { Item(Item.Properties().tab(CreativeTabs.Parts)) }
    val burntBark: RegistryObject<Item> = ITEMS.register("burnt_bark") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val machineUpgradeTemplate: RegistryObject<Item> = ITEMS.register("machine_upgrade_template") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val blankRune: RegistryObject<Item> = ITEMS.register("blank_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val isaRune: RegistryObject<Item> = ITEMS.register("isa_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val dagazRune: RegistryObject<Item> = ITEMS.register("dagaz_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val hagalazRune: RegistryObject<Item> = ITEMS.register("hagalaz_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val jeraRune: RegistryObject<Item> = ITEMS.register("jera_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val thurisazRune: RegistryObject<Item> = ITEMS.register("thurisaz_rune") { Item(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1)) }
    val burnedOutQuadSchrabidiumFuelRod: RegistryObject<Item> = ITEMS.register("burned_out_quad_schrabidium_rod") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts).stacksTo(1).rarity(Rarity.EPIC)) }
    val scrap: RegistryObject<Item> = ITEMS.register("scrap") { object : Item(Properties().tab(CreativeTabs.Parts)) {
        override fun getBurnTime(itemStack: ItemStack?) = 800
    }}
    val hotDepletedUraniumFuel: RegistryObject<Item> = ITEMS.register("hot_depleted_uranium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val hotDepletedThoriumFuel: RegistryObject<Item> = ITEMS.register("hot_depleted_thorium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val hotDepletedPlutoniumFuel: RegistryObject<Item> = ITEMS.register("hot_depleted_plutonium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val hotDepletedMOXFuel: RegistryObject<Item> = ITEMS.register("hot_depleted_mox_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val hotDepletedSchrabidiumFuel: RegistryObject<Item> = ITEMS.register("hot_depleted_schrabidium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding, EffectItem.EffectTypes.Hot), Item.Properties().tab(CreativeTabs.Parts), 40f) }
    val depletedUraniumFuel: RegistryObject<Item> = ITEMS.register("depleted_uranium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val depletedThoriumFuel: RegistryObject<Item> = ITEMS.register("depleted_thorium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 10f) }
    val depletedPlutoniumFuel: RegistryObject<Item> = ITEMS.register("depleted_plutonium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val depletedMOXFuel: RegistryObject<Item> = ITEMS.register("depleted_mox_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val depletedSchrabidiumFuel: RegistryObject<Item> = ITEMS.register("depleted_schrabidium_fuel") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive, EffectItem.EffectTypes.Blinding), Item.Properties().tab(CreativeTabs.Parts), 40f) }
    val trinitite: RegistryObject<Item> = ITEMS.register("trinitite") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), .1f) }
    val nuclearWaste: RegistryObject<Item> = ITEMS.register("nuclear_waste") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 15f) }
    val tinyNuclearWaste: RegistryObject<Item> = ITEMS.register("tiny_nuclear_waste") { EffectItem(listOf(EffectItem.EffectTypes.Radioactive), Item.Properties().tab(CreativeTabs.Parts), 2f) }
    val crystalHorn: RegistryObject<Item> = ITEMS.register("crystal_horn") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }
    val charredCrystal: RegistryObject<Item> = ITEMS.register("charred_crystal") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Parts)) }

    // Items and Fuel

    val battery: RegistryObject<BatteryItem> = ITEMS.register("battery") { BatteryItem(20_000, 400, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val redstonePowerCell: RegistryObject<BatteryItem> = ITEMS.register("redstone_power_cell") { BatteryItem(60_000, 400, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val sixfoldRedstonePowerCell: RegistryObject<BatteryItem> = ITEMS.register("sixfold_redstone_power_cell") { BatteryItem(360_000, 400, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val twentyFourFoldRedstonePowerCell: RegistryObject<BatteryItem> = ITEMS.register("twenty_four_fold_redstone_power_cell") { BatteryItem(1_440_000, 400, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val advancedBattery: RegistryObject<BatteryItem> = ITEMS.register("advanced_battery") { BatteryItem(80_000, 2_000, 2_000, Item.Properties().tab(CreativeTabs.Items)) }
    val advancedPowerCell: RegistryObject<BatteryItem> = ITEMS.register("advanced_power_cell") { BatteryItem(240_000, 2_000, 2_000, Item.Properties().tab(CreativeTabs.Items)) }
    val quadrupleAdvancedPowerCell: RegistryObject<BatteryItem> = ITEMS.register("quadruple_advanced_power_cell") { BatteryItem(960_000, 2_000, 2_000, Item.Properties().tab(CreativeTabs.Items)) }
    val twelveFoldAdvancedPowerCell: RegistryObject<BatteryItem> = ITEMS.register("twelvefold_advanced_power_cell") { BatteryItem(2_880_000, 2_000, 2_000, Item.Properties().tab(CreativeTabs.Items)) }
    val lithiumBattery: RegistryObject<BatteryItem> = ITEMS.register("lithium_battery") { BatteryItem(1_000_000, 4_000, 4_000, Item.Properties().tab(CreativeTabs.Items)) }
    val lithiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("lithium_power_cell") { BatteryItem(3_000_000, 4_000, 4_000, Item.Properties().tab(CreativeTabs.Items)) }
    val tripleLithiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("triple_lithium_power_cell") { BatteryItem(9_000_000, 4_000, 4_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sixfoldLithiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("sixfold_lithium_power_cell") { BatteryItem(18_000_000, 4_000, 4_000, Item.Properties().tab(CreativeTabs.Items)) }
    val schrabidiumBattery: RegistryObject<BatteryItem> = ITEMS.register("schrabidium_battery") { BatteryItem(4_000_000, 20_000, 20_000, Item.Properties().rarity(Rarity.RARE).tab(CreativeTabs.Items)) }
    val schrabidiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("schrabidium_power_cell") { BatteryItem(12_000_000, 20_000, 20_000, Item.Properties().rarity(Rarity.RARE).tab(CreativeTabs.Items)) }
    val doubleSchrabidiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("double_schrabidium_power_cell") { BatteryItem(24_000_000, 20_000, 20_000, Item.Properties().rarity(Rarity.RARE).tab(CreativeTabs.Items)) }
    val quadrupleSchrabidiumPowerCell: RegistryObject<BatteryItem> = ITEMS.register("quadruple_schrabidium_power_cell") { BatteryItem(48_000_000, 20_000, 20_000, Item.Properties().rarity(Rarity.RARE).tab(CreativeTabs.Items)) }
    val sparkBattery: RegistryObject<BatteryItem> = ITEMS.register("spark_battery") { BatteryItem(400_000_000, 8_000_000, 8_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val offBrandSparkBattery: RegistryObject<BatteryItem> = ITEMS.register("off_brand_spark_battery") { BatteryItem(20_000_000, 160_000, 800_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkPowerCell: RegistryObject<BatteryItem> = ITEMS.register("spark_power_cell") { BatteryItem(2_400_000_000L, 8_000_000, 8_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkArcaneCarBattery: RegistryObject<BatteryItem> = ITEMS.register("spark_arcane_car_battery") { BatteryItem(10_000_000_000L, 8_000_000, 8_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkArcaneEnergyStorageArray: RegistryObject<BatteryItem> = ITEMS.register("spark_arcane_energy_storage_array") { BatteryItem(40_000_000_000L, 8_000_000, 8_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkArcaneMassEnergyVoid: RegistryObject<BatteryItem> = ITEMS.register("spark_arcane_mass_energy_void") { BatteryItem(400_000_000_000L, 80_000_000, 80_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkArcaneDiracSea: RegistryObject<BatteryItem> = ITEMS.register("spark_arcane_dirac_sea") { BatteryItem(1_000_000_000_000L, 80_000_000, 80_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkSolidSpaceTimeCrystal: RegistryObject<BatteryItem> = ITEMS.register("spark_solid_space_time_crystal") { BatteryItem(4_000_000_000_000L, 800_000_000, 800_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    val sparkLudicrousPhysicsDefyingEnergyStorageUnit: RegistryObject<BatteryItem> = ITEMS.register("spark_ludicrous_physics_defying_energy_storage_unit") { BatteryItem(400_000_000_000_000L, 800_000_000, 800_000_000, Item.Properties().tab(CreativeTabs.Items)) }
    // TODO electronium cube
    val infiniteBattery: RegistryObject<BatteryItem> = ITEMS.register("infinite_battery") { BatteryOfInfinity(Item.Properties().tab(CreativeTabs.Items)) }
    val singleUseBattery: RegistryObject<BatteryItem> = ITEMS.register("single_use_battery") { BatteryItem(6_000, 0, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val largeSingleUseBattery: RegistryObject<BatteryItem> = ITEMS.register("large_single_use_battery") { BatteryItem(14_000, 0, 400, Item.Properties().tab(CreativeTabs.Items)) }
    val potatoBattery: RegistryObject<BatteryItem> = ITEMS.register("potato_battery") { BatteryItem(400, 0, 400, Item.Properties().tab(CreativeTabs.Items)) }
    // TODO PotatOS
    val steamPoweredEnergyStorageTank: RegistryObject<BatteryItem> = ITEMS.register("steam_powered_energy_storage_tank") { BatteryItem(240_000, 1_200, 24_000, Item.Properties().tab(CreativeTabs.Items)) }
    val largeSteamPoweredEnergyStorageTank: RegistryObject<BatteryItem> = ITEMS.register("large_steam_powered_energy_storage_tank") { BatteryItem(400_000, 2_000, 40_000, Item.Properties().tab(CreativeTabs.Items)) }

    val stoneFlatStamp: RegistryObject<Item> = ITEMS.register("stone_flat_stamp") { Item(Item.Properties().durability(10).tab(CreativeTabs.Items)) }
    val stonePlateStamp: RegistryObject<Item> = ITEMS.register("stone_plate_stamp") { Item(Item.Properties().durability(10).tab(CreativeTabs.Items)) }
    val stoneWireStamp: RegistryObject<Item> = ITEMS.register("stone_wire_stamp") { Item(Item.Properties().durability(10).tab(CreativeTabs.Items)) }
    val stoneCircuitStamp: RegistryObject<Item> = ITEMS.register("stone_circuit_stamp") { Item(Item.Properties().durability(10).tab(CreativeTabs.Items)) }
    val ironFlatStamp: RegistryObject<Item> = ITEMS.register("iron_flat_stamp") { Item(Item.Properties().durability(50).tab(CreativeTabs.Items)) }
    val ironPlateStamp: RegistryObject<Item> = ITEMS.register("iron_plate_stamp") { Item(Item.Properties().durability(50).tab(CreativeTabs.Items)) }
    val ironWireStamp: RegistryObject<Item> = ITEMS.register("iron_wire_stamp") { Item(Item.Properties().durability(50).tab(CreativeTabs.Items)) }
    val ironCircuitStamp: RegistryObject<Item> = ITEMS.register("iron_circuit_stamp") { Item(Item.Properties().durability(50).tab(CreativeTabs.Items)) }
    val steelFlatStamp: RegistryObject<Item> = ITEMS.register("steel_flat_stamp") { Item(Item.Properties().durability(100).tab(CreativeTabs.Items)) }
    val steelPlateStamp: RegistryObject<Item> = ITEMS.register("steel_plate_stamp") { Item(Item.Properties().durability(100).tab(CreativeTabs.Items)) }
    val steelWireStamp: RegistryObject<Item> = ITEMS.register("steel_wire_stamp") { Item(Item.Properties().durability(100).tab(CreativeTabs.Items)) }
    val steelCircuitStamp: RegistryObject<Item> = ITEMS.register("steel_circuit_stamp") { Item(Item.Properties().durability(100).tab(CreativeTabs.Items)) }
    val titaniumFlatStamp: RegistryObject<Item> = ITEMS.register("titanium_flat_stamp") { Item(Item.Properties().durability(150).tab(CreativeTabs.Items)) }
    val titaniumPlateStamp: RegistryObject<Item> = ITEMS.register("titanium_plate_stamp") { Item(Item.Properties().durability(150).tab(CreativeTabs.Items)) }
    val titaniumWireStamp: RegistryObject<Item> = ITEMS.register("titanium_wire_stamp") { Item(Item.Properties().durability(150).tab(CreativeTabs.Items)) }
    val titaniumCircuitStamp: RegistryObject<Item> = ITEMS.register("titanium_circuit_stamp") { Item(Item.Properties().durability(150).tab(CreativeTabs.Items)) }
    val obsidianFlatStamp: RegistryObject<Item> = ITEMS.register("obsidian_flat_stamp") { Item(Item.Properties().durability(170).tab(CreativeTabs.Items)) }
    val obsidianPlateStamp: RegistryObject<Item> = ITEMS.register("obsidian_plate_stamp") { Item(Item.Properties().durability(170).tab(CreativeTabs.Items)) }
    val obsidianWireStamp: RegistryObject<Item> = ITEMS.register("obsidian_wire_stamp") { Item(Item.Properties().durability(170).tab(CreativeTabs.Items)) }
    val obsidianCircuitStamp: RegistryObject<Item> = ITEMS.register("obsidian_circuit_stamp") { Item(Item.Properties().durability(170).tab(CreativeTabs.Items)) }
    val schrabidiumFlatStamp: RegistryObject<Item> = ITEMS.register("schrabidium_flat_stamp") { Item(Item.Properties().durability(3000).tab(CreativeTabs.Items)) }
    val schrabidiumPlateStamp: RegistryObject<Item> = ITEMS.register("schrabidium_plate_stamp") { Item(Item.Properties().durability(3000).tab(CreativeTabs.Items)) }
    val schrabidiumWireStamp: RegistryObject<Item> = ITEMS.register("schrabidium_wire_stamp") { Item(Item.Properties().durability(3000).tab(CreativeTabs.Items)) }
    val schrabidiumCircuitStamp: RegistryObject<Item> = ITEMS.register("schrabidium_circuit_stamp") { Item(Item.Properties().durability(3000).tab(CreativeTabs.Items)) }
    val aluminiumShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("aluminium_shredder_blade") { ShredderBlade(Item.Properties().durability(20).tab(CreativeTabs.Items)) }
    val goldShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("gold_shredder_blade") { ShredderBlade(Item.Properties().durability(30).tab(CreativeTabs.Items)) }
    val ironShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("iron_shredder_blade") { ShredderBlade(Item.Properties().durability(100).tab(CreativeTabs.Items)) }
    val steelShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("steel_shredder_blade") { ShredderBlade(Item.Properties().durability(200).tab(CreativeTabs.Items)) }
    val titaniumShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("titanium_shredder_blade") { ShredderBlade(Item.Properties().durability(350).tab(CreativeTabs.Items)) }
    val advancedAlloyShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("advanced_alloy_shredder_blade") { ShredderBlade(Item.Properties().durability(700).tab(CreativeTabs.Items)) }
    val combineSteelShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("combine_steel_shredder_blade") { ShredderBlade(Item.Properties().durability(1500).tab(CreativeTabs.Items)) }
    val schrabidiumShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("schrabidium_shredder_blade") { ShredderBlade(Item.Properties().durability(2000).tab(CreativeTabs.Items)) }
    val deshShredderBlade: RegistryObject<ShredderBlade> = ITEMS.register("desh_shredder_blade") { ShredderBlade(Item.Properties().stacksTo(1).tab(CreativeTabs.Items)) }

    // Templates

    val machineTemplateFolder: RegistryObject<TemplateFolder> = ITEMS.register("machine_template_folder") { TemplateFolder() }

    // Siren Tracks
    val sirenTrackHatchSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_hatch_siren") { SirenTrack(SoundEvents.sirenTrackHatchSiren, 250, true, 0x334077) }
    val sirenTrackAutopilotDisconnected: RegistryObject<SirenTrack> = ITEMS.register("siren_track_autopilot_disconnected") { SirenTrack(SoundEvents.sirenTrackAutopilotDisconnected, 50, true, 0xB5B5B5) }
    val sirenTrackAMSSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_ams_siren") { SirenTrack(SoundEvents.sirenTrackAMSSiren, 100, true, 0xE5BB52) }
    val sirenTrackBlastDoorAlarm: RegistryObject<SirenTrack> = ITEMS.register("siren_track_blast_door_alarm") { SirenTrack(SoundEvents.sirenTrackBlastDoorAlarm, 50, true, 0xB20000) }
    val sirenTrackAPCSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_apc_siren") { SirenTrack(SoundEvents.sirenTrackAPCSiren, 100, true, 0x3666A0) }
    val sirenTrackKlaxon: RegistryObject<SirenTrack> = ITEMS.register("siren_track_klaxon") { SirenTrack(SoundEvents.sirenTrackKlaxon, 50, true, 0x808080) }
    val sirenTrackVaultDoorAlarm: RegistryObject<SirenTrack> = ITEMS.register("siren_track_vault_door_alarm") { SirenTrack(SoundEvents.sirenTrackVaultDoorAlarm, 50, true, 0x8C810B) }
    val sirenTrackSecurityAlert: RegistryObject<SirenTrack> = ITEMS.register("siren_track_security_alert") { SirenTrack(SoundEvents.sirenTrackSecurityAlert, 50, true, 0x76818E) }
    val sirenTrackStandardSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_standard_siren") { SirenTrack(SoundEvents.sirenTrackStandardSiren, 250, true, 0x660000) }
    val sirenTrackClassicSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_classic_siren") { SirenTrack(SoundEvents.sirenTrackClassicSiren, 250, true, 0xC0CFE8) }
    val sirenTrackBankAlarm: RegistryObject<SirenTrack> = ITEMS.register("siren_track_bank_alarm") { SirenTrack(SoundEvents.sirenTrackBankAlarm, 100, true, 0x3684E2) }
    val sirenTrackBeepSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_beep_siren") { SirenTrack(SoundEvents.sirenTrackBeepSiren, 100, true, 0xD3D3D3) }
    val sirenTrackContainerAlarm: RegistryObject<SirenTrack> = ITEMS.register("siren_track_container_alarm") { SirenTrack(SoundEvents.sirenTrackContainerAlarm, 100, true, 0xE0BA9F) }
    val sirenTrackSweepSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_sweep_siren") { SirenTrack(SoundEvents.sirenTrackSweepSiren, 500, true, 0xEDEA5A) }
    val sirenTrackMissileSiloSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_missile_silo_siren") { SirenTrack(SoundEvents.sirenTrackMissileSiloSiren, 500, true, 0xABAB9A) }
    val sirenTrackAirRaidSiren: RegistryObject<SirenTrack> = ITEMS.register("siren_track_air_raid_siren") { SirenTrack(SoundEvents.sirenTrackAirRaidSiren, 1000, false, 0xDF3795) }
    val sirenTrackNostromoSelfDestruct: RegistryObject<SirenTrack> = ITEMS.register("siren_track_nostromo_self_destruct") { SirenTrack(SoundEvents.sirenTrackNostromoSelfDestruct, 100, true, 0x5DD800) }
    val sirenTrackEASAlarmScreech: RegistryObject<SirenTrack> = ITEMS.register("siren_track_eas_alarm_screech") { SirenTrack(SoundEvents.sirenTrackEASAlarmScreech, 50, true, 0xB3A8C1) }
    val sirenTrackAPCPass: RegistryObject<SirenTrack> = ITEMS.register("siren_track_apc_pass") { SirenTrack(SoundEvents.sirenTrackAPCPass, 50, false, 0x3437D3) }
    val sirenTrackRazortrainHorn: RegistryObject<SirenTrack> = ITEMS.register("siren_track_razortrain_horn") { SirenTrack(SoundEvents.sirenTrackRazortrainHorn, 250, false, 0x7750ED) }

    // Bomb Items

    val bundleOfImplosionPropellant: RegistryObject<Item> = ITEMS.register("bundle_of_implosion_propellant") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Bombs).stacksTo(1)) }
    val bombIgniter: RegistryObject<Item> = ITEMS.register("bomb_igniter") { AutoTooltippedItem(Item.Properties().tab(CreativeTabs.Bombs).stacksTo(1)) }
    val plutoniumCore: RegistryObject<Item> = ITEMS.register("plutonium_core") { object : EffectItem(listOf(EffectTypes.Radioactive), Properties().tab(CreativeTabs.Bombs).stacksTo(1), 5F) {
        override fun appendHoverText(stack: ItemStack, worldIn: World?, tooltip: MutableList<ITextComponent>, flagIn: ITooltipFlag) {
            autoTooltip(stack, tooltip)
            super.appendHoverText(stack, worldIn, tooltip, flagIn)
        }
    }}
    val detonator: RegistryObject<Detonator> = ITEMS.register("detonator") { Detonator(Item.Properties().tab(CreativeTabs.Bombs).stacksTo(1)) }
    val fatManKit: RegistryObject<BombKitItem> = ITEMS.register("fat_man_kit") { BombKitItem(mapOf(ModBlockItems.fatMan to 1) + FatMan.requiredComponents, 0xFFD800, Item.Properties().tab(CreativeTabs.Bombs)) }

    // Consumables

    val oilDetector: RegistryObject<OilDetector> = ITEMS.register("oil_detector") { OilDetector(Item.Properties().tab(CreativeTabs.Consumables).stacksTo(1)) }

    // Miscellaneous

    val nuclearCreeperSpawnEgg: RegistryObject<SpawnEggItem> = ITEMS.register("nuclear_creeper_spawn_egg") { NuclearSpawnEggItem(EntityTypes.nuclearCreeperEntity, 0x1E3E2E, 0x66B300, Item.Properties().tab(CreativeTabs.Miscellaneous)) }

    // Hidden

    val creativeNuclearExplosionSpawner: RegistryObject<CreativeNuclearExplosionSpawner> = ITEMS.register("creative_nuclear_explosion_spawner") { CreativeNuclearExplosionSpawner(Item.Properties().stacksTo(1)) }

    private fun Item.Properties.tab(tab: CreativeTabs): Item.Properties = tab(tab.itemGroup)
}
