ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "BasicScalaProjectThatNeedsFixing",
    semanticdbEnabled := true, // enable SemanticDB
    semanticdbVersion := scalafixSemanticdb.revision, // only required for Scala 2.x
    scalacOptions += "-Ywarn-unused" // Scala 2.x only, required by `RemoveUnused`
  )


// scalacOptions += "-Wunused"
// scalacOptions += "-Ywarn-unused"
// scalacOptions += "-Xlint:unused"