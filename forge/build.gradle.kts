
plugins { id("dev.architectury.loom") }
dependencies {
  minecraft("com.mojang:minecraft:" + property("mc_version"))
  mappings(loom.officialMojangMappings())
  forge("net.minecraftforge:forge:" + property("mc_version") + "-" + property("forge_version"))
  implementation(project(":mod-common"))
}
