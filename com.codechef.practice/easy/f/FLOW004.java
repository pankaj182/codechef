package easy.f;

import java.util.Scanner;

class FLOW004 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int t, d1, d2, n;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    while (t > 0) {
      d1 = d2 = 0;
      t -= 1;
      n = sc.nextInt();
      d1 = (n % 10);
      d2 = reverse(n) % 10;
      System.out.println(d1 + d2);
    }
  }

  private static int reverse(int n) {
    int rev = 0;
    while (n != 0) {
      rev = rev * 10 + (n % 10);
      n /= 10;
    }
    return rev;
  }
}
