
plugins { java }
repositories { mavenCentral() }
dependencies {
  compileOnly("com.velocitypowered:velocity-api:" + property("velocity_api_version"))
  annotationProcessor("com.velocitypowered:velocity-api:" + property("velocity_api_version"))
  implementation(project(":plugin-common"))
}
