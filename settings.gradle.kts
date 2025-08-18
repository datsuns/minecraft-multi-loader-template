
pluginManagement {
  repositories {
    gradlePluginPortal()
    maven("https://maven.fabricmc.net/")
    maven("https://maven.architectury.dev/")
    maven("https://maven.quiltmc.org/repository/release")
    maven("https://maven.neoforged.net/releases")
    maven("https://repo.papermc.io/repository/maven-public/")
    mavenCentral()
  }
  plugins {
    id("dev.architectury.loom") version "REPLACE_ME"
    id("org.quiltmc.loom") version "REPLACE_ME"
  }
}

rootProject.name = "examplemod-multiloader"

include("core", "mod-common", "fabric", "quilt", "forge", "neoforge", "plugin-common", "paper", "velocity")
