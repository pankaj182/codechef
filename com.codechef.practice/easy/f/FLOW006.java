package easy.f;

import java.util.Scanner;

class FLOW006 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    short t, d, sum;
    int n;
    Scanner sc = new Scanner(System.in);
    t = sc.nextShort();
    while (t > 0) {
      sum = 0;
      t -= 1;
      n = sc.nextInt();

      while (n > 0) {
        d = (short) (n % 10);
        sum += d;
        n /= 10;
      }
      System.out.println(sum);
    }
  }
}
