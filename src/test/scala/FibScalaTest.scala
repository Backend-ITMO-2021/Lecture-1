import org.scalatest.funsuite.AnyFunSuite
import ru.itmo.backend_2021.ScalaMain

class FibScalaTest extends AnyFunSuite {
  test("ScalaMain.fib") {
    for {
      (num, i) <- FibNumbers()
    } yield {
      assert(ScalaMain.fib(i) == num)
    }
  }

  test("ScalaMain.fib hard test") {
    ScalaMain.fib(1000000)
  }
}
