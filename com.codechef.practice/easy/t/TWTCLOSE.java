package easy.t;

import java.util.Arrays;
import java.util.Scanner;

class TWTCLOSE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    int a[] = new int[n];
    int c = 0;
    for (int i = 0; i < k; i++) {
      String s = input.next();
      if (s.equalsIgnoreCase("CLOSEALL")) {
        c = 0;
        Arrays.fill(a, 0);
      } else {
        int t = input.nextInt();
        if (a[t - 1] == 0) {
          a[t - 1] = 1;
          c++;
        } else if (a[t - 1] == 1) {
          a[t - 1] = 0;
          c--;
        }
      }
      System.out.println(c);
    }
  }
}
