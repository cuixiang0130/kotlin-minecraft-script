rootProject.name = "kotlin-minecraft-script"

pluginManagement {
    resolutionStrategy {
        plugins {
            val kotlinVersion = extra["kotlin.version"] as String
            kotlin("multiplatform") version kotlinVersion
        }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":server")

include(":server-ui")

include(":bom")

