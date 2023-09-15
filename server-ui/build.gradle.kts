plugins {
    `kotlin-js-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":server"))
}
