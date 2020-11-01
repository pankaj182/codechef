package easy.c;

import java.util.Scanner;

class CHOPRT {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t, a, b;
    t = sc.nextInt();
    while (t-- > 0) {
      a = sc.nextInt();
      b = sc.nextInt();
      if (a > b) {
        System.out.println(">");
      } else if (a < b) {
        System.out.println("<");
      } else {
        System.out.println("=");
      }
    }
    sc.close();
  }
}
