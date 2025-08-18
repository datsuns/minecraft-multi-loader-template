
plugins { java }
repositories { maven("https://repo.papermc.io/repository/maven-public/") }
dependencies {
  compileOnly("io.papermc.paper:paper-api:" + property("paper_api_version"))
  implementation(project(":plugin-common"))
}
java { toolchain { languageVersion.set(JavaLanguageVersion.of((property("java_version") as String).toInt())) } }
