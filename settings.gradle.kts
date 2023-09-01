rootProject.name = "kotlin_lessons"

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}

include("m1lesson1")
