package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n <= 1) return n
    var n1 = 0
    var n2 = 1
    for (_ <- 1 until n) {
      n2 = n1 + n2
      n1 = n2 - n1
    }
    n2
  }
}
