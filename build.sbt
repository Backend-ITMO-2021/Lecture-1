name := "Lecture-1"

version := "1.0"

scalaVersion := "2.13.5"

TaskKey[Unit]("runScala") := (runMain in Compile).toTask(" ru.itmo.backend_2021.ScalaMain").value
TaskKey[Unit]("runJava") := (runMain in Compile).toTask(" ru.itmo.backend_2021.JavaMain").value
