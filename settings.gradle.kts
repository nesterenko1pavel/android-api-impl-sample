pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ApiImplSample"
include(":app")
include(":base:core")
include(":base:core_java")

include(":features:main")
include(":features:main_api")
include(":features:profile")
include(":features:profile_api")
