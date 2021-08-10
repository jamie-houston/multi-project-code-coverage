plugins {
    id("myproject.java-conventions")
    `java-library`
    kotlin("jvm")
}

dependencies {
    implementation(project(":list"))
}
