package easy.t;

import java.util.Scanner;

class TRISQ {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int b = sc.nextInt();
      int h = b / 2 - 1;
      System.out.println(h * (h + 1) / 2);
    }
    sc.close();
  }
}
