package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n == 0) return 0
    var prevPrev = 0
    var prev = 0
    var current = 1
    for (i <- 1 until n) {
      prevPrev = prev
      prev = current
      current = prev + prevPrev
    }
    return current
  }
}
