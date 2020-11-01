package easy.f;

import java.util.Scanner;

class FLOW008 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    short n;
    while (test > 0) {
      test -= 1;
      n = sc.nextShort();
      if (n < 10) {
        System.out.println("What an obedient servant you are!");
      } else {
        System.out.println(-1);
      }
    }
  }
}
