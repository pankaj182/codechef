package easy.c;

import java.util.Scanner;

class CIELRCPT {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short ctr, t = sc.nextShort();
    int n;
    while (t-- > 0) {
      n = sc.nextInt();
      ctr = (short) (n / 2048);
      n = n % 2048;
      while (n != 0) {
        if (n % 2 == 1)
          ctr++;
        n /= 2;
      }
      System.out.println(ctr);
    }
  }
}
