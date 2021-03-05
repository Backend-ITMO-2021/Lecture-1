package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var fibIntLim = 46;
    if (n <= fibIntLim) {
      var fibArr = new Array[int](n + 1);
      fibArr[0] = 0;
      fibArr[1] = 1;
      for (index <- 2 to n) {
        fibArr[index] = fibArr[index - 1] + fibArr[index - 2];
      }
      return fibArr[n];
    } return 1000000;
  }
}
