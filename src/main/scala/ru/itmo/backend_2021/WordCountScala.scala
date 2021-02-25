package ru.itmo.backend_2021

object WordCountScala extends App {
  println(
    args(0)
      .split(" ")
      .groupBy(identity)
      .transform((_, v) => v.length)
  )
}
