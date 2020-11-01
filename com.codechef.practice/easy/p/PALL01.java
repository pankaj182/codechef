package easy.p;

import java.util.Scanner;

class PALL01 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short t = sc.nextShort();
    int n, temp, rev;
    while (t-- > 0) {
      rev = 0;
      n = sc.nextInt();
      rev = reverse(n);
      if (rev == n) {
        System.out.println("wins");
      } else {
        System.out.println("losses");
      }
    }
    sc.close();
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
