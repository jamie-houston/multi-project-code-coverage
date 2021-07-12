// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("org.sonarqube") version "3.3"
}


allprojects {
    repositories {
        mavenCentral()
        google()
    }

    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
            useIR = true
        }
    }
}

sonarqube {
    properties {
        property("sonar.host.url", "http://localhost:9000")
        property ("sonar.coverage.jacoco.xmlReportPaths", "${rootProject.projectDir}/code-coverage-report/build/reports/jacoco/codeCoverageReport/codeCoverageReport.xml")
    }
}