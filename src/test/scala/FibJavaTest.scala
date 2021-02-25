import org.scalatest.funsuite.AnyFunSuite
import ru.itmo.backend_2021.JavaMain

class FibJavaTest extends AnyFunSuite {
  test("JavaMain.fib") {
    for {
      (num, i) <- FibNumbers()
    } yield {
      assert(JavaMain.fib(i) == num)
    }
  }

  test("JavaMain.fib hard test") {
    JavaMain.fib(1000000)
  }
}

