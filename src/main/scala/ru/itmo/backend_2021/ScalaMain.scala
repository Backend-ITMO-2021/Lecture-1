package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var a: Int = 0
    var b: Int = 1
    for (f <- 1 to n) {
      val c: Int = a + b
      a = b
      b = c
    }
    a
  }
}
