package at.martinthedragon.nucleartech.config

import net.minecraftforge.common.ForgeConfigSpec
import net.minecraftforge.fml.config.ModConfig

class ClientConfig : ConfigBase {
    override val fileName = "client"
    override val configSpec: ForgeConfigSpec
    override val configType = ModConfig.Type.CLIENT

    val displayCustomCapes: ForgeConfigSpec.BooleanValue

    init {
        ForgeConfigSpec.Builder().apply {
            comment("Client config. Only present on client, duh.").push(fileName)

            comment("Render settings").push("rendering")
            displayCustomCapes = comment("Disable this if there are any rendering problems with other mods. Please leave it on otherwise for respect.").define("displayCustomCapes", true)
            pop()

            pop()
            configSpec = build()
        }
    }
}
