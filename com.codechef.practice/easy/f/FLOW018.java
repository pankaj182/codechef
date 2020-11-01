package easy.f;

import java.util.Scanner;

class FLOW018 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    long pdt;
    int num;
    while (t-- > 0) {
      pdt = 1;
      num = sc.nextInt();
      for (int i = 1; i <= num; i++)
        pdt *= i;
      System.out.println(pdt);
    }
  }
}
