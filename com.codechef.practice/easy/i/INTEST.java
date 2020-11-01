package easy.i;

import java.util.Scanner;

class INTEST {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int n, k, c = 0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    while (n-- > 0) {
      if (sc.nextInt() % k == 0)
        c++;
    }
    System.out.println(c);
    sc.close();
  }
}
