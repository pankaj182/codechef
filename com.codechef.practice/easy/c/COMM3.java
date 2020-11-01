package easy.c;

import java.util.Scanner;

class COMM3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    while (t-- > 0) {
      int a = input.nextInt();
      int x1 = input.nextInt();
      int y1 = input.nextInt();
      int x2 = input.nextInt();
      int y2 = input.nextInt();
      int x3 = input.nextInt();
      int y3 = input.nextInt();
      double d1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      double d2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
      double d3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
      if (d1 + d2 <= 2 * a || d2 + d3 <= 2 * a || d3 + d1 <= 2 * a) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}
