
allprojects {
  repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.architectury.dev/")
    maven("https://maven.quiltmc.org/repository/release")
    maven("https://maven.neoforged.net/releases")
    maven("https://repo.papermc.io/repository/maven-public/")
  }
  plugins.withType<JavaPlugin> {
    the<JavaPluginExtension>().toolchain.languageVersion.set(JavaLanguageVersion.of( (findProperty("java_version") as String).toInt() ))
  }
}
