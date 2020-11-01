package easy.f;

import java.util.Scanner;

class FRUITS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short t = sc.nextShort();
    short n, m, k, small, large, difference = 0;
    while (t-- > 0) {
      n = sc.nextShort();
      m = sc.nextShort();
      k = sc.nextShort();
      small = (n < m ? n : m);
      large = (n > m ? n : m);
      if ((small + k) <= large) {
        difference = (short) (large - (small + k));
      } else {
        difference = 0;
      }
      System.out.println(difference);
    }
    sc.close();
  }
}
