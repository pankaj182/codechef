package easy.d;

import java.util.Scanner;

class DIFFSUM {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    if (n1 > n2) {
      System.out.println(n1 - n2);
    } else {
      System.out.println(n1 + n2);
    }
    sc.close();
  }

}
