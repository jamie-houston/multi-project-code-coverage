plugins {
    id("myproject.jacoco-aggregation")
    kotlin("jvm")
}

dependencies {
    implementation(project(":application"))
}
