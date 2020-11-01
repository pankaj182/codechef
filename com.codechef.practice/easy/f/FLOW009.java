package easy.f;

import java.text.DecimalFormat;
import java.util.Scanner;

class FLOW009 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner s = new Scanner(System.in);
    DecimalFormat decimalFormatter = new DecimalFormat("0.000000");
    int t = s.nextInt();
    while (t-- > 0) {
      double a = s.nextDouble();
      double b = s.nextDouble();
      double p, p1;
      p = a * b;
      if (a > 1000) {
        p = p * 9 / 10;
      }
      String s1 = decimalFormatter.format(p);
      System.out.println(s1);
    }
  }
}
