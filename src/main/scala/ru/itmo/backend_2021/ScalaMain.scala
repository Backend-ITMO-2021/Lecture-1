package ru.itmo.backend_2021
import scala.NotImplementedError

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    if (n < 0) throw new NotImplementedError("")
    if (n == 0) 0
    else if (n == 1) 1
    else fib(n - 1) + fib(n - 2)
  }
}
