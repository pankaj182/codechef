package easy.a;

import java.util.Scanner;

class AMR15A {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);

    int solderiesCount = sc.nextInt();
    int evenCount = 0;

    for (int i = 0; i < solderiesCount; i++) {
      int n = sc.nextInt();
      if (n % 2 == 0) {
        evenCount++;
      }
    }
    if (evenCount > solderiesCount / 2) {
      System.out.println("READY FOR BATTLE");
    } else {
      System.out.println("NOT READY");
    }
    sc.close();
  }
}
