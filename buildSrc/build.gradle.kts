import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

val properties = Properties().apply {
    file("../gradle.properties").bufferedReader().use { load(it) }
}

dependencies {
    implementation(kotlin("gradle-plugin", properties.getProperty("kotlin.version")))
}