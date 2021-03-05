package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    // Your code goes here
        if (n == 0) return 0
        var number = 0
        var nextNumber = 1
        for (_ <- 1 until n) {
          val summa = nextNumber
          nextNumber = nextNumber + number
          number = summa
        }
        nextNumber
    // And ends there
  }
}
