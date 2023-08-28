plugins {
    `maven-publish`
    signing
}

publishing {
    publications {
        if (plugins.hasPlugin("org.jetbrains.kotlin.multiplatform")) {
            withType<MavenPublication> {
                artifactId = "minecraft-script-" + project.name
                pom {
                    name = artifactId
                }
            }
        } else {
            create<MavenPublication>("bom") {
                from(components["javaPlatform"])
            }
        }
    }
    repositories {
        maven {
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = properties["mavenCentralUsername"]?.toString()
                password = properties["mavenCentralPassword"]?.toString()
            }
        }
    }

}

signing{
    sign(publishing.publications)
}



