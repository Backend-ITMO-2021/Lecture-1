package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
    println(fib(20))
  }

  // SEQUENCE NUMBERING BEGINS FROM 1 AND NOT FROM 0. SO 1st NUMBER IS 0 AND NOT 1
  def fib(n: Int): Int = { // Your code goes here
    var n1 = 0
    var n2 = 1
    var k = 1
    var temp = 0
    if (n == 0) return 0
    else if (n == 1 || n == 2) return 1
    else {
      while ( {
        k != n
      }) {
        temp = n1 + n2
        n1 = n2
        n2 = temp
        k += 1
      }
      return n2
    }
  }


}
