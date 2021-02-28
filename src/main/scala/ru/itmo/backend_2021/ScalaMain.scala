package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var first = 0
    var second = 1
    if (n == 0) return 0
    if (n == 1) return 1
    for (i <- 2 until n + 1) {
      val temp = second
      second += first
      first = temp
    }
    return second
  }
}
