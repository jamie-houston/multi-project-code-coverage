:samples-dir: /home/tcagent1/agent/work/64493a816be20d5a/promote-projects/gradle/build/git-checkout/subprojects/docs/build/working/samples/install/jvm-multi-project-with-code-coverage
:gradle-version: 7.1

= Reporting code coverage with JaCoCo Sample

[.download]
- link:zips/sample_jvm_multi_project_with_code_coverage-groovy-dsl.zip[icon:download[] Groovy DSL]
- link:zips/sample_jvm_multi_project_with_code_coverage-kotlin-dsl.zip[icon:download[] Kotlin DSL]

NOTE: You can open this sample inside an IDE using the https://www.jetbrains.com/help/idea/gradle.html#gradle_import_project_start[IntelliJ native importer] or https://projects.eclipse.org/projects/tools.buildship[Eclipse Buildship].

This sample shows how to test Java projects with link:https://www.jacoco.org/jacoco/[JaCoCo] in Gradle.

To collect code coverage across multiple subprojects, we need to setup two aspects.
First, the projects that run the tests and collect the code coverage data:

====
include::sample[dir="groovy",files="buildSrc/src/main/groovy/myproject.java-conventions.gradle[]"]
include::sample[dir="kotlin",files="buildSrc/src/main/kotlin/myproject.java-conventions.gradle.kts[]"]
====

Here we do the setup in a _convention plugin_ called `myproject.java-conventions` which we apply to all our application and library projects.
Here, the build is setup to run tests using link:https://junit.org/junit5[JUnit5] and we apply the `jacoco` plugin to collect the code coverage.
With the plugin applied, it automatically attaches itself to the `test` task to collect the code coverage.
Please refer to the link:{userManualPath}/jacoco_plugin.html[JaCoCo chapter] for more details on the plugin configuration.

Second, to generate a report spanning all our tested projects, we introduce and additional project `code-coverage-report` that collects source files and coverage data from all its dependent projects.
This is setup in a second  _convention plugin_ plugin called `myproject.jacoco-aggregation` which provides a task called `codeCoverageReport` to generate the aggregated report.

====
include::sample[dir="groovy",files="buildSrc/src/main/groovy/myproject.jacoco-aggregation.gradle[]"]
include::sample[dir="kotlin",files="buildSrc/src/main/kotlin/myproject.jacoco-aggregation.gradle.kts[]"]
====

Running the tests and generate the report:

[listing.terminal.sample-command]
----
$ ./gradlew codeCoverageReport

BUILD SUCCESSFUL
11 actionable tasks: 11 executed
----

For more information, see link:{userManualPath}/java_testing.html[Testing in Java project chapter].
