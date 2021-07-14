name := """datatable"""
organization := "datatable"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

//Slick Libraries
libraryDependencies += "com.typesafe.slick" % "slick_2.13" % "3.3.3"
libraryDependencies += "com.typesafe.play" % "play-slick-evolutions_2.13" % "5.0.0"
libraryDependencies += "com.typesafe.play" % "play-slick_2.13" % "5.0.0"

//JDBC
libraryDependencies += "com.h2database" % "h2" % "1.4.200"
libraryDependencies += "org.postgresql" % "postgresql" % "42.1.1"

//Elastic Search
libraryDependencies += "org.elasticsearch" % "elasticsearch" % "7.13.3"


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "datatable.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "datatable.binders._"
