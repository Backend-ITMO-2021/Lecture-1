import org.scalatest.funsuite.AnyFunSuite
import ru.itmo.backend_2021.{JavaMain, ScalaMain}

class FibEasyTest extends AnyFunSuite {
  test("JavaMain.fib") {
    for {
      (num, i) <- FibNumbers()
    } yield {
      assert(JavaMain.fib(i) == num)
    }
  }

  test("ScalaMain.fib") {
    for {
      (num, i) <- FibNumbers()
    } yield {
      assert(ScalaMain.fib(i) == num)
    }
  }

}

object FibNumbers {
  def apply(): List[(Int, Int)] =
    List(
      0 -> 0,
      1 -> 1,
      1 -> 2,
      2 -> 3,
      3 -> 4,
      5 -> 5,
      8 -> 6,
      13 -> 7,
      21 -> 8,
      34 -> 9,
      55 -> 10,
      89 -> 11,
      144 -> 12,
      233 -> 13,
      377 -> 14,
      610 -> 15,
      987 -> 16,
      1597 -> 17,
      2584 -> 18,
      4181 -> 19,
      6765 -> 20
    )
}

