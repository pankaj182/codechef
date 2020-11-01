package easy.c;

import java.util.Scanner;

class CHEFSTLT {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases;
    String str1, str2;
    int length;
    int min, max, diff;

    testCases = sc.nextInt();
    while (testCases-- > 0) {
      str1 = sc.next();
      str2 = sc.next();

      max = diff = 0;
      length = str1.length();

      for (int i = 0; i < length; i++) {
        if (str1.charAt(i) == '?' || str2.charAt(i) == '?') {
          max++;
        } else if (str1.charAt(i) != str2.charAt(i)) {
          diff++;
        }
      }
      max = max + diff;
      min = diff;
      System.out.println(min + " " + max);
    }
  }
}
