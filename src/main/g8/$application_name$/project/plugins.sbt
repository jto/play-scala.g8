// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "$play_version$")

addSbtPlugin("net.databinder.giter8" % "giter8-scaffold" % "0.4.6-SNAPSHOT")
