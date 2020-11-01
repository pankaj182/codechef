package easy.s;

import java.util.Arrays;
import java.util.Scanner;

class SMPAIR {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();
      Arrays.sort(a);
      System.out.println(a[0] + a[1]);
    }
  }
}
