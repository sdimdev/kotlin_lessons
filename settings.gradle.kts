rootProject.name = "kotlin_lesson2"

pluginManagement {
    val kotlinVersion: String by settings
    val jvmMajorVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
include("m1lesson1")
