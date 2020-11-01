package easy.f;

import java.util.Scanner;

class FLOW013 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if (a + b + c == 180) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
