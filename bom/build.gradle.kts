plugins {
    `java-platform`
    `publish-conventions`
}

dependencies {
    constraints {
        api(project(":server"))
        api(project(":server-ui"))
    }
}
