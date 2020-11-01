package easy.h;

import java.util.Scanner;

class HS08TEST {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int withdraw;
    float initial;
    Scanner sc = new Scanner(System.in);
    withdraw = sc.nextInt();
    initial = sc.nextFloat();
    if (withdraw % 5 == 0 && initial >= (withdraw + 0.50))
      initial = (float) (initial - (withdraw + 0.50));
    System.out.printf("%.2f", initial);
  }

}