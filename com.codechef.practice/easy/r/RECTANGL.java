package easy.r;

import java.util.Scanner;

class RECTANGL {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      String answer = isRectanglePossible(a, b, c, d) ? "YES" : "NO";
      System.out.println(answer);
    }
    sc.close();
  }

  private static boolean isRectanglePossible(int a, int b, int c, int d) {
    boolean possible = true;
    if (a == b && c == d) {

    } else if (a == c && b == d) {

    } else if (a == d && b == c) {

    } else {
      possible = false;
    }
    return possible;
  }
}
