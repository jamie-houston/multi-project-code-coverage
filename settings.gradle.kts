rootProject.name = "jvm-multi-project-with-code-coverage"

// production code projects
include("application", "list", "utilities", "androidmodule")

// reporting utility projects
include("code-coverage-report")
