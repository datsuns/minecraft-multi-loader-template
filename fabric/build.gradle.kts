
plugins { id("dev.architectury.loom") }
dependencies {
  minecraft("com.mojang:minecraft:" + property("mc_version"))
  mappings(loom.officialMojangMappings())
  modImplementation("net.fabricmc:fabric-loader:" + property("fabric_loader_version"))
  modImplementation("net.fabricmc.fabric-api:fabric-api:" + property("fabric_api_version"))
  implementation(project(":mod-common"))
}
