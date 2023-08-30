import java.util.*

plugins {
    `maven-publish`
    signing
}

val localProperties = Properties().apply {
    rootProject.file("local.properties").bufferedReader().use { load(it) }
}

publishing {
    publications {
        if (plugins.hasPlugin("org.jetbrains.kotlin.multiplatform")) {
            withType<MavenPublication> {
                configPublication(project)
            }
        } else {
            create<MavenPublication>("bom") {
                val component = if (project.name == "bom") "javaPlatform" else "java"
                from(components[component])
                configPublication(project)
            }
        }
    }
    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = localProperties["mavenCentralUsername"] as String
                password = localProperties["mavenCentralPassword"] as String
            }
        }
    }

}

signing {
    useGpgCmd()
    sign(publishing.publications)
}
