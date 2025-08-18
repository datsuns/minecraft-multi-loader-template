
plugins { id("dev.architectury.loom") }
dependencies {
  neoForge("net.neoforged:neoforge:" + property("neoforge_version"))
  implementation(project(":mod-common"))
}
