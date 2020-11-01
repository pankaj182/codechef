package easy.t;

import java.util.Scanner;

class TRICOIN {
  public static void main(String[] args) {
    Scanner sc = null;
    int testCases;
    long coinsCount;
    try {
      sc = new Scanner(System.in);

      testCases = sc.nextInt();

      while (testCases-- > 0) {
        coinsCount = sc.nextLong();
        /*
         * n(n+1)/2 = coinsCount  , find n
         * n^2 + n - 2*coinsCount = 0
         */
        long height = ((long) Math.floor(Math.sqrt(1 + 8 * coinsCount)) - 1) / 2;
        System.out.println(height);
      }
    } catch (Exception e) {

    } finally {
      sc.close();
    }
  }
}
