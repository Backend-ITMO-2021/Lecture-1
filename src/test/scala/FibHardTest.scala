import org.scalatest.funsuite.AnyFunSuite
import ru.itmo.backend_2021.{JavaMain, ScalaMain}

class FibHardTest extends AnyFunSuite {

  test("ScalaMain.fib hard test") {
    ScalaMain.fib(1000000)
  }

  test("JavaMain.fib hard test") {
    JavaMain.fib(1000000)
  }
}
