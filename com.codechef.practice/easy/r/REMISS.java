package easy.r;

import java.util.Scanner;

class REMISS {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(Math.max(a, b) + " " + (a + b));
    }
    sc.close();
  }
}
