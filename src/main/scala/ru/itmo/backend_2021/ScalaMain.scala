package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var prev: Int = 0
    var curr: Int = 1
    for(i <- 0 until n){
      val next = prev + curr
      prev = curr
      curr = next
    }
    return prev
  }
}