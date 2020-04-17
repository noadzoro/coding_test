package com.kuebiko.it.karya;

/**
 * Given a positive integer "num" and number "limit"
 * find factorial for the total given "limit"
 * eg. num = 7, limit = 2 => 42 (7*6)
 *  num = 11, limit = 3 => 990 (11*10*9)
 *  num = 4, limit = 1 => 4 (4)
 *  num = 9, limit = 5 => 15120 (9*8*7*6*5)
 *  num = 21, limit = 4 => 143640 (9*8*7*6*5)
 */
public class FindLimitFactorial {

  public static void main(String[] args) {
    System.out.println(findLimitFactorial(21, 4));
  }

  public static long findLimitFactorial(int num, int limit) {
    int total = 1;

    for (int i = num; i > 0 && limit > 0; i--) {
      total *= i;
      limit--;
    }
    return Long.valueOf(total);
  }

}
