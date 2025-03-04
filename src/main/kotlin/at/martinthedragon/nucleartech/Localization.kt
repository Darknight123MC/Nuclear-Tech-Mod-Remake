package at.martinthedragon.nucleartech

import net.minecraft.network.chat.TranslatableComponent
import java.util.function.Supplier

// Arguments in comments
object LangKeys {
    const val CAT_ARMOR = "armor"
    const val CAT_BUTTON = "button"
    const val CAT_CHEMISTRY = "chemistry"
    const val CAT_CONTAINER = "container"
    const val CAT_DETONATOR = "detonator"
    const val CAT_DEVICE = "device"
    const val CAT_ENERGY = "energy"
    const val CAT_EXPLOSION_SPAWNER = "explosion_spawner"
    const val CAT_GEIGER = "geiger"
    const val CAT_HAZARD = "hazard"
    const val CAT_INFO = "info"
    const val CAT_JEI = "jei"
    const val CAT_OIL_WELL = "oil_well"
    const val CAT_SIREN_TRACK = "siren_track"
    const val CAT_UPGRADE = "upgrade"
    const val CAT_WORD = "word"

    val ARMOR_BLAST_PROTECTION = of(CAT_ARMOR, "blast_protection") // 1 float
    val ARMOR_CUSTOM_GEIGER = of(CAT_ARMOR, "custom_geiger")
    val ARMOR_DAMAGE_CAP = of(CAT_ARMOR, "damage_cap") // 1 float
    val ARMOR_DAMAGE_MODIFIER = of(CAT_ARMOR, "damage_modifier") // 1 float
    val ARMOR_DAMAGE_THRESHOLD = of(CAT_ARMOR, "damage_threshold") // 1 float
    val ARMOR_DAMAGE_RESISTANCE_MODIFIER = of(CAT_ARMOR, "damage_resistance_modifier") // 1 float, 1 string
    val ARMOR_DASH_COUNT = of(CAT_ARMOR, "dash_count") // 1 int
    val ARMOR_FIREPROOF = of(CAT_ARMOR, "fireproof")
    val ARMOR_FULL_SET_BONUS = of(CAT_ARMOR, "full_set_bonus")
    val ARMOR_GEIGER_SOUND = of(CAT_ARMOR, "geiger_sound")
    val ARMOR_GRAVITY = of(CAT_ARMOR, "gravity") // 1 double
    val ARMOR_HARD_LANDING = of(CAT_ARMOR, "hard_landing")
    val ARMOR_NULLIFIES_DAMAGE = of(CAT_ARMOR, "nullifies_damage") // 1 string
    val ARMOR_PROJECTILE_PROTECTION = of(CAT_ARMOR, "projectile_protection") // 1 float
    val ARMOR_PROTECTION_YIELD = of(CAT_ARMOR, "protection_yield") // 1 float
    val ARMOR_THERMAL = of(CAT_ARMOR, "thermal")
    val ARMOR_VATS = of(CAT_ARMOR, "vats")

    val BUTTON_CANCEL = of(CAT_BUTTON, "cancel")
    val BUTTON_START = of(CAT_BUTTON, "start")

    val CHEMISTRY_URANIUM_HEXAFLUORIDE = of(CAT_CHEMISTRY, "sulfur_and_uranium_hexafluoride_from_chemistry")

    val CONTAINER_ANVIL = of(CAT_CONTAINER, "anvil")
    val CONTAINER_ASSEMBLER = of(CAT_CONTAINER, "assembler")
    val CONTAINER_BLAST_FURNACE = of(CAT_CONTAINER, "blast_furnace")
    val CONTAINER_CHEM_PLANT = of(CAT_CONTAINER, "chem_plant")
    val CONTAINER_COMBUSTION_GENERATOR = of(CAT_CONTAINER, "combustion_generator")
    val CONTAINER_ELECTRIC_FURNACE = of(CAT_CONTAINER, "electric_furnace")
    val CONTAINER_FAT_MAN = of(CAT_CONTAINER, "fat_man")
    val CONTAINER_LAUNCH_PAD = of(CAT_CONTAINER, "launch_pad")
    val CONTAINER_LITTLE_BOY = of(CAT_CONTAINER, "little_boy")
    val CONTAINER_OIL_DERRICK = of(CAT_CONTAINER, "oil_derrick")
    val CONTAINER_PUMPJACK = of(CAT_CONTAINER, "pumpjack")
    val CONTAINER_SAFE = of(CAT_CONTAINER, "safe")
    val CONTAINER_SHREDDER = of(CAT_CONTAINER, "shredder")
    val CONTAINER_SIREN = of(CAT_CONTAINER, "siren")
    val CONTAINER_STEAM_PRESS = of(CAT_CONTAINER, "steam_press")

    val DETONATOR_INVALID_BLOCK_ENTITY = of(CAT_DETONATOR, "invalid_block_entity")
    val DETONATOR_MISSING_COMPONENTS = of(CAT_DETONATOR, "missing_components")
    val DETONATOR_NO_EXPLOSIVE = of(CAT_DETONATOR, "no_explosive")
    val DETONATOR_PROHIBITED = of(CAT_DETONATOR, "prohibited")
    val DETONATOR_SUCCESS = of(CAT_DETONATOR, "success")
    val DETONATOR_UNKNOWN_ERROR = of(CAT_DETONATOR, "unknown_error")

    val DEVICE_OIL_DETECTOR_BELOW = of(CAT_DEVICE, "oil_detector.below")
    val DEVICE_OIL_DETECTOR_NEAR = of(CAT_DEVICE, "oil_detector.near")
    val DEVICE_OIL_DETECTOR_NO_OIL = of(CAT_DEVICE, "oil_detector.no_oil")
    val DEVICE_POSITION_SET = of(CAT_DEVICE, "position_set")
    val DEVICE_POSITION_NOT_LOADED = of(CAT_DEVICE, "position_not_loaded")
    val DEVICE_POSITION_NOT_SET = of(CAT_DEVICE, "position_not_set")

    val ENERGY = of(CAT_ENERGY, "energy")
    val ENERGY_CHARGE_RATE = of(CAT_ENERGY, "charge_rate") // 1 string
    val ENERGY_DISCHARGE_RATE = of(CAT_ENERGY, "discharge_rate") // 1 string
    val ENERGY_ENERGY_STORED = of(CAT_ENERGY, "energy_stored") // 1 string

    val EXPLOSION_SPAWNER_ERROR_EXTRA_FALLOUT = of(CAT_EXPLOSION_SPAWNER, "error_extra_fallout")
    val EXPLOSION_SPAWNER_ERROR_STRENGTH = of(CAT_EXPLOSION_SPAWNER, "error_strength")
    val EXPLOSION_SPAWNER_EXTRA_FALLOUT = of(CAT_EXPLOSION_SPAWNER, "extra_fallout")
    val EXPLOSION_SPAWNER_HAS_FALLOUT = of(CAT_EXPLOSION_SPAWNER, "has_fallout")
    val EXPLOSION_SPAWNER_MUTED = of(CAT_EXPLOSION_SPAWNER, "muted")
    val EXPLOSION_SPAWNER_NO_PERMISSION = of(CAT_EXPLOSION_SPAWNER, "no_permission")
    val EXPLOSION_SPAWNER_POSITION = of(CAT_EXPLOSION_SPAWNER, "position")
    val EXPLOSION_SPAWNER_STRENGTH = of(CAT_EXPLOSION_SPAWNER, "strength")

    val GEIGER_CHUNK_RADIATION = of(CAT_GEIGER, "chunk_radiation")
    val GEIGER_PLAYER_IRRADIATION = of(CAT_GEIGER, "player_irradiation")
    val GEIGER_PLAYER_RESISTANCE = of(CAT_GEIGER, "player_resistance")
    val GEIGER_TITLE = of(CAT_GEIGER, "title")
    val GEIGER_TOTAL_ENVIRONMENTAL_RADIATION = of(CAT_GEIGER, "total_environmental_radiation") // 1 float

    val HAZARD_ASBESTOS = of(CAT_HAZARD, "asbestos")
    val HAZARD_BLINDING = of(CAT_HAZARD, "blinding")
    val HAZARD_COAL = of(CAT_HAZARD, "coal")
    val HAZARD_DIGAMMA = of(CAT_HAZARD, "digamma")
    val HAZARD_EXPLOSIVE = of(CAT_HAZARD, "explosive")
    val HAZARD_HEAT = of(CAT_HAZARD, "heat")
    val HAZARD_HYDROREACTIVE = of(CAT_HAZARD, "hydroreactive")
    val HAZARD_RADIATON = of(CAT_HAZARD, "radiation")

    val INFO_INPUT = of(CAT_INFO, "input")
    val INFO_INPUTS = of(CAT_INFO, "inputs")
    val INFO_OUTPUT = of(CAT_INFO, "output")
    val INFO_OUTPUTS = of(CAT_INFO, "outputs")
    val INFO_POSITION = of(CAT_INFO, "position") // 3 ints
    val INFO_PRODUCTION_TIME = of(CAT_INFO, "production_time")

    val JEI_CATEGORY_ASSEMBLING = of(CAT_JEI, "category.assembling")
    val JEI_CATEGORY_BLASTING = of(CAT_JEI, "category.blasting")
    val JEI_CATEGORY_CHEMISTRY = of(CAT_JEI, "category.chemistry")
    val JEI_CATEGORY_CONSTRUCTING = of(CAT_JEI, "category.constructing")
    val JEI_CATEGORY_PRESSING = of(CAT_JEI, "category.pressing")
    val JEI_CATEGORY_SHREDDING = of(CAT_JEI, "category.shredding")
    val JEI_CATEGORY_SMITHING = of(CAT_JEI, "category.smithing")
    val JEI_CATEGORY_TEMPLATE_FOLDER = of(CAT_JEI, "category.template_folder")
    val JEI_EXPERIENCE = of(CAT_JEI, "experience") // 1 float
    val JEI_OUTPUT_CHANCE = of(CAT_JEI, "output_chance")
    val JEI_TIER_MINIMUM = of(CAT_JEI, "minimum_tier") // 1 int
    val JEI_TIER_RANGE = of(CAT_JEI, "tier_range") // 2 int

    val OIL_WELL_STATUS_ERROR = of(CAT_OIL_WELL, "status.error")
    val OIL_WELL_STATUS_LOOKING_FOR_OIL = of(CAT_OIL_WELL, "status.looking_for_oil")
    val OIL_WELL_STATUS_NO_OIL_SOURCE = of(CAT_OIL_WELL, "status.no_oil_source")
    val OIL_WELL_STATUS_NO_POWER = of(CAT_OIL_WELL, "status.no_power")
    val OIL_WELL_STATUS_OK = of(CAT_OIL_WELL, "status.ok")
    val OIL_WELL_STATUS_OUT_OF_FLUID = of(CAT_OIL_WELL, "status.out_of_fluid")

    val SIREN_TRACK_LOOP = of(CAT_SIREN_TRACK, "loop")
    val SIREN_TRACK_ONCE = of(CAT_SIREN_TRACK, "once")
    val SIREN_TRACK_RANGE = of(CAT_SIREN_TRACK, "range") // 1 int
    val SIREN_TRACK_SIREN_TRACK = of(CAT_SIREN_TRACK, "siren_track")

    val UPGRADE_INFO_ACCEPTED_UPGRADES = of(CAT_UPGRADE, "info.accepted_upgrades")
    val UPGRADE_INFO_BURN_GAS = of(CAT_UPGRADE, "info.burn_gas") // 1 int, 1 string
    val UPGRADE_INFO_CONSUMPTION = of(CAT_UPGRADE, "info.consumption") // 1 string
    val UPGRADE_INFO_DELAY = of(CAT_UPGRADE, "info.delay") // 1 string
    val UPGRADE_INFO_STACKS_TO = of(CAT_UPGRADE, "info.stacks_to") // 1 int
    val UPGRADE_NAME_AFTER_BURNER = of(CAT_UPGRADE, "name.after_burner")
    val UPGRADE_NAME_OVERDRIVE = of(CAT_UPGRADE, "name.overdrive")
    val UPGRADE_NAME_POWER_SAVING = of(CAT_UPGRADE, "name.power_saving")
    val UPGRADE_NAME_SPEED = of(CAT_UPGRADE, "name.speed")
    val UPGRADE_WARN_INCOMPATIBLE = of(CAT_UPGRADE, "warn.incompatible")
    val UPGRADE_WARN_MACHINE_NOT_UPGRADEABLE = of(CAT_UPGRADE, "warn.machine_not_upgradeable")
    val UPGRADE_WARN_NOT_A_MACHINE = of(CAT_UPGRADE, "warn.not_a_machine")
    val UPGRADE_WARN_VIEW_MACHINE = of(CAT_UPGRADE, "warn.view_machine")
    val UPGRADE_WARN_UNKNOWN_COMPATIBILITY = of(CAT_UPGRADE, "warn.unknown_compatibility")

    val WORD_SECONDS = of(CAT_WORD, "seconds")

    @Suppress("NOTHING_TO_INLINE")
    private inline fun of(key: String) = TranslationKey(key)

    @Suppress("NOTHING_TO_INLINE")
    private inline fun of(category: String, path: String, namespace: String = NuclearTech.MODID) = TranslationKey(category, path, namespace)
}

@JvmInline
value class TranslationKey(val key: String) : Supplier<TranslatableComponent> {
    constructor(category: String, path: String, namespace: String = NuclearTech.MODID) : this("$category.$namespace.$path")

    init {
        require(key.count { it == '.' } >= 2) { "Translation key '$key' doesn't appear to in format CATEGORY.NAMESPACE.PATH" }
        require(key.none(Char::isUpperCase)) { "Translation key '$key' contains uppercase characters" }
    }

    val category get() = key.substringBefore('.')
    val namespace get() = key.substringAfter('.').substringBefore('.')
    val path get() = key.substringAfter('.').substringAfter('.')

    override fun get() = TranslatableComponent(key)
    fun format(vararg args: Any) = TranslatableComponent(key, *args)

    companion object {
        fun isValidKey(key: String) = key.count { it == '.' } >= 2 && key.none(Char::isUpperCase)
    }
}

@Suppress("DeprecatedCallableAddReplaceWith") @Deprecated("Use LangKeys.")
fun ntmTranslationString(key: String) = "${NuclearTech.MODID}.$key"
