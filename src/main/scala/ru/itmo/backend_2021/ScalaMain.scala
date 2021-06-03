package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println(fib(80))
  }

  def fib(n: Int): Long = {
    // Your code goes here
    if (n == 0) return 0
    var current :Long = 1
    var prev :Long = 0
    for (i <- 1 until n) {
      current = prev + current
      prev = current - prev

    }
    return current
    // And ends there
  }
}
