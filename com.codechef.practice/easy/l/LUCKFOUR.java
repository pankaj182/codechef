package easy.l;

import java.util.Scanner;

class LUCKFOUR {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int count = 0, r = 0;
      int N = sc.nextInt();

      while (N != 0) {
        r = N % 10;
        N /= 10;
        if (r == 4) {
          count = count + 1;
        }
      }
      System.out.println(count);
    }
  }
}
