
plugins { id("org.quiltmc.loom") }
dependencies {
  minecraft("com.mojang:minecraft:" + property("mc_version"))
  mappings(loom.officialMojangMappings())
  modImplementation("org.quiltmc:quilt-loader:" + "REPLACE_ME")
  // modImplementation("org.quiltmc.quilted-fabric-api:quilted-fabric-api:" + property("qfapi_version"))
  implementation(project(":mod-common"))
}
