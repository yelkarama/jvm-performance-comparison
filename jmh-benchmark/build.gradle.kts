plugins {
  id("me.champeau.jmh") version "0.6.6"
}

dependencies {
    implementation(project(":fibonacci"))
}

jmh {
  fork.set(1)
  iterations.set(100)
  timeOnIteration.set("1s")
  warmupIterations.set(0)
  benchmarkMode.set( listOf("thrpt") )
  threads.set(4)
  includeTests.set(false)
  duplicateClassesStrategy.set(DuplicatesStrategy.INCLUDE)
}
