package easy.t;

import java.util.Scanner;

class TLG {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a, b, diff = 0;
    boolean winner1 = true;
    long sum1 = 0, sum2 = 0;
    while (n-- > 0) {
      a = sc.nextInt();
      b = sc.nextInt();
      sum1 += a;
      sum2 += b;
      if (diff < Math.abs(sum1 - sum2)) {
        diff = (int) Math.abs(sum1 - sum2);
        if (sum1 > sum2)
          winner1 = true;
        else
          winner1 = false;
      }

    }
    if (winner1)
      System.out.println("1" + " " + diff);
    else
      System.out.println("2" + " " + diff);
    sc.close();
  }
}
