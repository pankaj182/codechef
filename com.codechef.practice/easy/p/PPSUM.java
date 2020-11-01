package easy.p;

import java.util.Scanner;

class PPSUM {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int testCases;
    int d, n;
    long num, sum;

    Scanner sc = new Scanner(System.in);
    testCases = sc.nextInt();
    while (testCases-- > 0) {
      d = sc.nextInt();
      n = sc.nextInt();

      num = n;
      sum = 0;
      while (d-- > 0) {
        sum = num * (num + 1) / 2;
        num = sum;
      }
      System.out.println(sum);
    }
  }
}
