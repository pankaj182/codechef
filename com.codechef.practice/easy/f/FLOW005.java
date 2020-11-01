package easy.f;

import java.util.Scanner;

class FLOW005 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int amt;
    short count;
    short t = sc.nextShort();
    while (t > 0) {
      t -= 1;
      count = 0;
      amt = sc.nextInt();

      count += (amt / 100);
      amt = amt % 100;

      count += (amt / 50);
      amt = amt % 50;

      count += (amt / 10);
      amt = amt % 10;

      count += (amt / 5);
      amt = amt % 5;

      count += (amt / 2);
      amt = amt % 2;

      count += (amt / 1);
      amt = amt % 1;

      System.out.println(count);


    }
  }
}
