import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

allprojects {
    group = "com.fineconstant"
    version = "1.0.0-SNAPSHOT"

    repositories {
        jcenter()
    }
}

subprojects {
    apply(plugin = "kotlin")

    tasks.withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "17"
    }
}

plugins {
    kotlin("jvm") version "1.6.21"
}
