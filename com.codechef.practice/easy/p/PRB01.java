package easy.p;

import java.util.Scanner;

class PRB01 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short t = sc.nextShort();
    int n;
    short count;
    while (t > 0) {
      count = 0;
      t -= 1;
      n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
        if (n % i == 0)
          count++;
      }
      if (count == 2)
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}
