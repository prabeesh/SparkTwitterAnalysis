name := "TwitterPopularTags"

version := "0.2.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "0.9.0-incubating",
"org.apache.spark" %% "spark-streaming" % "0.9.0-incubating",
"org.apache.spark" %% "spark-streaming-twitter" % "0.9.0-incubating")

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
