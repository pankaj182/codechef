package easy.r;

import java.util.Scanner;

class RECIPE {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      int v = a[0];
      for (int i = 1; i < n; i++)
        v = gcd(v, a[i]);
      for (int i : a)
        System.out.print((i / v) + " ");
      System.out.println();
    }
  }

  static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return (gcd(b, a % b));
  }
}
