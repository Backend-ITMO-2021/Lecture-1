package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): BigInt = {
    @scala.annotation.tailrec
    def fib_tail(n: Int, prev: BigInt, next: BigInt): BigInt = n match {
      case 0 => prev
      case 1 => next
      case _ => fib_tail(n - 1, next, prev + next)
    }

    fib_tail(n, 0, 1)
  }
}
