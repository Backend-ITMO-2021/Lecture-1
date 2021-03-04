package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var a = 0
    var b = 1
    for (i <- 1 to n) {
      val c = a + b
      a = b
      b = c
    }
    a
  }
}
