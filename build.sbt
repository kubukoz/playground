libraryDependencies ++= Seq(
  "co.fs2" %% "fs2-core" % "1.0.0-M5"
)

scalacOptions ++= Seq(
  "-Ypartial-unification"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
name := "typelevel-alchemist-playground"
