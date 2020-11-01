package easy.t;

import java.util.Scanner;

class TWOSTR {
  public static void main(String[] args) {
    Scanner sc = null;
    int testCases;
    String str1, str2;
    int length;
    boolean isMatchable;
    try {
      sc = new Scanner(System.in);

      testCases = sc.nextInt();
      while (testCases-- > 0) {
        str1 = sc.next();
        str2 = sc.next();

        isMatchable = true;
        length = str1.length();

        for (int i = 0; i < length; i++) {
          if (str1.charAt(i) != '?' && str2.charAt(i) != '?') {
            if (str1.charAt(i) != str2.charAt(i)) {
              isMatchable = false;
              break;
            }
          }
        }
        System.out.println(isMatchable ? "Yes" : "No");
      }
    } catch (Exception e) {

    } finally {
      sc.close();
    }
  }
}
