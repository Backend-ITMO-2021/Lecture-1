package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    // Your code goes here
    var first = 0
    var second = 1
    var count = 0

    while(count < n){
      val sum = first + second
      first = second
      second = sum
      count = count + 1
    }

    first
    // And ends there
  }
}
