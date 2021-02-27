package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    // Your code goes here
    if (n == 0) return 0
    var a: Int = 0
    var b: Int = 1
    var i = 0
    for (i <- 2 to n) {
      val c: Int = a + b
      a = b
      b = c
    }
    return b
    // And ends there
  }
}
