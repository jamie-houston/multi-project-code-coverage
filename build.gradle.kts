plugins {
    id ("org.sonarqube") version "3.3"
}

sonarqube {
    properties {
        property("sonar.host.url", "http://localhost:9000")
        property ("sonar.coverage.jacoco.xmlReportPaths", "${rootProject.projectDir}/code-coverage-report/build/reports/jacoco/codeCoverageReport/codeCoverageReport.xml")
    }
}
repositories {
    mavenCentral()
}
