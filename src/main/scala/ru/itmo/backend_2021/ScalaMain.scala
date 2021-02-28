package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    // Your code goes here
    
    /*
    n match {
    	case 0 => 0
    	case 1 => 1
    	case n => fib(n-1) + fib(n-2)
    }
	*/

	n match {
		case 0 => 0
		case 1 => 1
		case n => {
			var prev: Int = 0
    		var next: Int = 1
    		var s: Int = 0
    		for (i<-2 to n) {
    			s = prev + next
    			prev = next
    			next = s
    		}
    		return s
		}
	}

    // ???
    // And ends there
  }
}
