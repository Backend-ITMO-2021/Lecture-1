package ru.itmo.backend_2021;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static BigInteger fib(int n) {
    BigInteger prev = new BigInteger("0");
    BigInteger next = new BigInteger("1");
    for (int i = 0; i < n; i++) {
      next = prev.add(next);
      prev = next.subtract(prev);
    }

    return prev;
  }

  /*
  public static BigInteger fibFormula(int n) {
    BigDecimal SQRT5 = BigDecimal.valueOf(Math.sqrt(5));
    BigDecimal PHI = SQRT5.add(BigDecimal.ONE).divide(BigDecimal.valueOf(2), 15, BigDecimal.ROUND_DOWN);
    BigDecimal RES = PHI.pow(n).divide(SQRT5, 15, BigDecimal.ROUND_DOWN).add(BigDecimal.valueOf(0.5));

    return RES.toBigInteger();
  }
  */
}
