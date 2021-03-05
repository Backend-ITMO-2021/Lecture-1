import org.scalatest.funsuite.AnyFunSuite
import ru.itmo.backend_2021.{JavaMain, ScalaMain}

class FibVeryHardTest extends AnyFunSuite {
  test("ScalaMain.fib very hard test") {
    assert(ScalaMain.fib(80) == 23416728348467685L)
  }

  test("JavaMain.fib very hard test") {
    assert(JavaMain.fib(80) == 23416728348467685L)
  }
}
