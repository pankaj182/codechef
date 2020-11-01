package easy.m;

import java.util.Scanner;

class MUFFINS3 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      System.out.println(n / 2 + 1);
    }
    sc.close();
  }
}
