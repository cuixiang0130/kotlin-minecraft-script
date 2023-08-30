import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
}

kotlin {

    explicitApi()

    js {
        moduleName = project.name
        browser()
        nodejs()
        useEsModules()
    }

}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        useEsClasses = true
    }
}
