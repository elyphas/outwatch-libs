addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.32")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler-sjs06" % "0.17.0")

resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
//addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "202001240947")
addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "202001070854")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
