import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("myproject.jacoco-aggregation")
    kotlin("jvm")
}

dependencies {
    implementation(project(":application"))
    implementation(kotlin("stdlib-jdk8"))
}

//sonarqube {
//    properties {
//        property("sonar.host.url", "http://localhost:9000")
//        property ("sonar.coverage.jacoco.xmlReportPaths", "${buildDir}/reports/jacoco/codeCoverageReport/codeCoverageReport.xml")
//    }
//}
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