package easy.f;

import java.util.Scanner;

class FLOW007 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int t, n;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while (t > 0) {
      t -= 1;
      n = sc.nextInt();
      int rev = reverse(n);
      System.out.println(rev);
    }
  }

  private static int reverse(int n) {
    int rev = 0;
    while (n > 0) {
      int d = (short) (n % 10);
      rev = rev * 10 + d;
      n /= 10;
    }
    return rev;
  }
}
