package easy.f;

import java.util.Scanner;

class FLOW017 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short t = sc.nextShort();
    int a, b, c;
    while (t > 0) {
      t -= 1;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      if ((a > b && a < c || (a > c && a < b))) {
        System.out.println(a);
      } else if ((b > a && b < c || (b > c && b < a))) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }
  }
}
