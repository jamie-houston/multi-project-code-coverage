import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("myproject.java-conventions")
    application
    kotlin("jvm")
}

dependencies {
    implementation(project(":list"))
    implementation(project(":utilities"))
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClass.set("org.gradle.sample.Main")
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