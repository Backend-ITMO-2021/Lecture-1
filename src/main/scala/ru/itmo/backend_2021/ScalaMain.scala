package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def iterate(i: Int, a: Int, b: Int): Int =
      if (i == n) a else iterate(i+1, b, a+b)
    iterate(0, 0, 1)
  }
}
