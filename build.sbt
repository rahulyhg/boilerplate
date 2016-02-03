name := "Boilerplate"

organization := "nl.tvogels"

version:= "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "ch.ethz.dalab" %% "dissolvestruct" % "0.1-SNAPSHOT"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.4.1"

resolvers += "IESL Release" at "http://dev-iesl.cs.umass.edu/nexus/content/groups/public"

libraryDependencies += "cc.factorie" % "factorie" % "1.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0"

resolvers += Resolver.sonatypeRepo("public")

resolvers += "IESL Release" at "http://dev-iesl.cs.umass.edu/nexus/content/groups/public"
libraryDependencies += "cc.factorie" % "factorie" % "1.0"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

