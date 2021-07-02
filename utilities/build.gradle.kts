import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("myproject.java-conventions")
    `java-library`
    kotlin("jvm")
}

dependencies {
    implementation(project(":list"))
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}