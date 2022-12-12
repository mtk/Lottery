ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

libraryDependencies += "dev.zio" %% "zio" % "2.0.5"
libraryDependencies += "dev.zio" %% "zio-http" % "0.0.3"

lazy val root = (project in file("."))
  .settings(
    name := "Lottery",
    idePackagePrefix := Some("com.mofjwutu")
  )
