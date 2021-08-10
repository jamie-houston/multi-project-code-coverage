plugins {
    id("myproject.java-conventions")
    application
    kotlin("jvm")
}

dependencies {
    implementation(project(":list"))
    implementation(project(":utilities"))
}

application {
    mainClass.set("org.gradle.sample.Main")
}