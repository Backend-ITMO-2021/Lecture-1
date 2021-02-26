package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    // Your code goes here
    if (n <= 1) return n
    var previous = 0
    var result = 1
    for (_ <- 1 until n) {
      result = previous + result
      previous = result - previous
    }
    result
    // And ends there
  }
}
