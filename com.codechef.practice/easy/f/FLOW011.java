package easy.f;

import java.util.Scanner;

class FLOW011 {
  public static void main(String[] args) {
    int testCases;
    int basic;
    double hra, da, gross;

    Scanner sc = new Scanner(System.in);

    testCases = sc.nextInt();
    while (testCases-- > 0) {
      basic = sc.nextInt();
      if (basic < 1500) {
        hra = 0.1 * basic;
        da = 0.9 * basic;
      } else {
        hra = 500;
        da = 0.98 * basic;
      }
      gross = basic + hra + da;
      System.out.printf("%.2f", gross);
      System.out.println();
    }
  }
}
