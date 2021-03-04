package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n < 0) throw new IllegalArgumentException("`n` CANNOT be a negative integer!")

    if (n == 0) return 0
    if (n == 1 || n == 2) return 1

    var f1 = 1
    var f2 = 1
    for (i <- 3 to n) {
      val f3 = f1 + f2
      f1 = f2
      f2 = f3
    }
    return f2
  }
}
