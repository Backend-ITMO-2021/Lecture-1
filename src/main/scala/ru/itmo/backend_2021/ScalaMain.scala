package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println(fib(80))
  }

  def fib(n: Int): Long = {
    // Your code goes here

    if (n < 0) {
      new IndexOutOfBoundsException("Index number must be positive")
    }

    val f = new Array[Long](n + 2)
    f(0) = 0
    f(1) = 1

    for (i <- 2 to n) {
      f(i) = f(i - 1) + f(i - 2)
    }

    f(n)
    // And ends there
  }
}
