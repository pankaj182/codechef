package easy.f;

import java.util.Scanner;

class FLOW002 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    short t, a, b;
    Scanner sc = new Scanner(System.in);
    t = sc.nextShort();
    while (t > 0) {
      t -= 1;
      a = sc.nextShort();
      b = sc.nextShort();
      System.out.println(a % b);
    }
  }
}
