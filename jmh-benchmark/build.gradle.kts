plugins {
  id("me.champeau.jmh") version "0.6.6"
}

dependencies {
    implementation(project(":fibonacci"))
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

