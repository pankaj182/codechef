package easy.f;

import java.util.Scanner;

class FSQRT {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short t = sc.nextShort();
    int n, result;
    while (t-- > 0) {
      n = sc.nextInt();
      result = (int) Math.sqrt(n);
      System.out.println(result);
    }
  }
}
