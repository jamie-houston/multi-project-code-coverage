plugins {
    id("myproject.jacoco-aggregation")
//    id ("org.sonarqube") version "3.3"
}

dependencies {
    implementation(project(":application"))
}

//sonarqube {
//    properties {
//        property("sonar.host.url", "http://localhost:9000")
//        property ("sonar.coverage.jacoco.xmlReportPaths", "${buildDir}/reports/jacoco/codeCoverageReport/codeCoverageReport.xml")
//    }
//}
