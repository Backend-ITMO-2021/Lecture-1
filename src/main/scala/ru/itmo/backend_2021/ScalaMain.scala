package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n == 0) return 0
    var first = 0
    var second = 1
    for (_ <- 1 until n) {
      val temp = second
      second = second + first
      first = temp
    }
    second
  }
}
