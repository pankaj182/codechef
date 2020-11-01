package easy.h;

import java.util.Scanner;

class HEADBOB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String st = sc.next();
      if (st.contains("Y")) {
        System.out.println("NOT INDIAN");
      } else if (st.contains("I")) {
        System.out.println("INDIAN");
      } else {
        System.out.println("NOT SURE");
      }
    }
    sc.close();
  }
}
