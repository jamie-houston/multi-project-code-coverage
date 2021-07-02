import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("org.sonarqube") version "3.3"
    kotlin("jvm") version "1.5.20"
}

sonarqube {
    properties {
        property("sonar.host.url", "http://localhost:9000")
        property ("sonar.coverage.jacoco.xmlReportPaths", "${rootProject.projectDir}/code-coverage-report/build/reports/jacoco/codeCoverageReport/codeCoverageReport.xml")
    }
}
dependencies {
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