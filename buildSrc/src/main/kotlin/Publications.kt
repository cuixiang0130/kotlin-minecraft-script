import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPublication

fun MavenPublication.configPublication(project:Project) {
    val prefix = project.rootProject.name + '-'
    artifactId = prefix + artifactId
    version = "$version-${project.rootProject.version}"
    pom {
        name.set(prefix + project.name)
        description.set(project.description)
        url.set("https://github.com/cuixiang0130/kotlin-minecraft-script")
        developers {
            developer {
                id.set("cuixiang0130")
                name.set("cuixiang0130")
                email.set("cuixiang0130@gmail.com")
            }
        }
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        scm {
            connection.set("scm:git:https://github.com/cuixiang0130/kotlin-minecraft-script.git")
            developerConnection.set("scm:git:https://github.com/cuixiang0130/kotlin-minecraft-script.git")
            url.set("https://github.com/cuixiang0130/kotlin-minecraft-script")
        }
    }
}