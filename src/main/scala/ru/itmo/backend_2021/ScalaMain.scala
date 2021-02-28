package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n <= 0) return n

    var first = 0
    var second = 1

    for (_ <- 1 to n) {
      val sum = first + second
      first = second
      second = sum
    }

    first
  }
}
