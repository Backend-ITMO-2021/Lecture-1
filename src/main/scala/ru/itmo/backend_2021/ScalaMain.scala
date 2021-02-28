package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    val lastTwo = Array(0, 1)

    if (n < 0) return 0
    if (n < 2) return lastTwo(n)

    for (_ <- 1 until n) {
      val sum: Int = lastTwo(0) + lastTwo(1)
      lastTwo(0) = lastTwo(1)
      lastTwo(1) = sum
    }

    lastTwo(1)
  }
}
