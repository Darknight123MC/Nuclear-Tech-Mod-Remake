package at.martinthedragon.nucleartech.datagen

import at.martinthedragon.nucleartech.NuclearTech
import at.martinthedragon.nucleartech.particle.ModParticles
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.mojang.logging.LogUtils
import net.minecraft.core.particles.ParticleType
import net.minecraft.data.DataGenerator
import net.minecraft.data.DataProvider
import net.minecraft.data.HashCache
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.packs.PackType
import net.minecraftforge.common.data.ExistingFileHelper
import org.slf4j.Logger
import java.util.function.Supplier

class NuclearParticleProvider(private val dataGenerator: DataGenerator, private val existingFileHelper: ExistingFileHelper) : DataProvider {
    override fun getName() = "Nuclear Tech Mod Particles"

    private fun createParticleDefinitions() {
        add(ModParticles.CONTRAIL, "contrail")
        add(ModParticles.OIL_SPILL, "oil_spill")
        empty(ModParticles.RUBBLE)
        add(ModParticles.SMOKE, "smoke")
    }

    private fun empty(particle: Supplier<out ParticleType<*>>) = add(particle, emptyList())
    private fun add(particle: Supplier<out ParticleType<*>>, vararg textures: String) = add(particle, textures.map { ResourceLocation(NuclearTech.MODID, it) })
    private fun add(particle: Supplier<out ParticleType<*>>, vararg textures: ResourceLocation) = add(particle, textures.toList())
    private fun add(particle: Supplier<out ParticleType<*>>, textures: Collection<ResourceLocation>) {
        particles[particle.get()] = textures
    }

    private val particles = mutableMapOf<ParticleType<*>, Collection<ResourceLocation>>()

    override fun run(cache: HashCache) {
        particles.clear()
        createParticleDefinitions()
        validate()
        for ((particleType, textures) in particles) save(cache, particleType, textures)
    }

    private fun validate() {
        val invalid = particles
            .mapKeys { (particleType, _) -> particleType.registryName ?: throw IllegalStateException("ParticleType '${particleType::class.qualifiedName}' is not registered") }
            .filterNot { (particleName, textures) -> validateTextures(particleName, textures) }
        if (invalid.isNotEmpty()) throw IllegalStateException("Found invalid particles:\n${invalid.keys.joinToString("\n")}")
    }

    private fun validateTextures(particle: ResourceLocation, textures: Collection<ResourceLocation>): Boolean {
        val invalid = textures.filterNot { existingFileHelper.exists(it, PackType.CLIENT_RESOURCES, ".png", "textures/particle") }
        invalid.forEach { LOGGER.warn("Unable to find texture '${it.namespace}:textures/particle/${it.path}.png' for particle $particle") }
        return invalid.isEmpty()
    }

    private fun save(cache: HashCache, particle: ParticleType<*>, textures: Collection<ResourceLocation>) {
        val particleLocation = particle.registryName!!
        DataProvider.save(GSON, cache, particleDefinitionToJson(textures), dataGenerator.outputFolder.resolve("assets/${particleLocation.namespace}/particles/${particleLocation.path}.json"))
    }

    private fun particleDefinitionToJson(textures: Collection<ResourceLocation>): JsonObject {
        if (textures.isEmpty()) return JsonObject()
        val textureArray = JsonArray()
        textures.forEach { textureArray.add(it.toString()) }
        val json = JsonObject()
        json.add("textures", textureArray)
        return json
    }

    private companion object {
        @JvmField val LOGGER: Logger = LogUtils.getLogger()
        @JvmField val GSON: Gson = GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()
    }
}
