plugins {
  id("me.champeau.jmh") version "0.6.6"
}

dependencies {
    implementation(project(":fibonacci"))
}

jmh {
  fork.set(1)
  iterations.set(20)
  timeOnIteration.set("5s")
  warmupIterations.set(0)
  benchmarkMode.set( listOf("thrpt") )
  threads.set(4)
  includeTests.set(false)
  duplicateClassesStrategy.set(DuplicatesStrategy.INCLUDE)
}

