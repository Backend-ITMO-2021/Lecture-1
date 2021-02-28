package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n == 0) return 0
    var a: Int = 0
    var s: Int = 1
    var i = 0
    for (i <- 2 to n) {
      val d: Int = a + s
      a = s
      s = d
    }
    return s
  }
}
