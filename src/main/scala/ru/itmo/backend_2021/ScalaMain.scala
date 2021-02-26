package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }
  def fib(n: Int): Int = {
    if (n == 0) {
      return 0
    }
    var fir_element: Int = 0
    var sec_element: Int = 1
    var sum: Int = 0
    for (i <- 1 until n) {
      sum = fir_element + sec_element
      fir_element = sec_element
      sec_element = sum
    }

    return sec_element
  }
}
