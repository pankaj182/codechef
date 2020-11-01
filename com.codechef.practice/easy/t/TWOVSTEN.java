package easy.t;

import java.util.Scanner;

class TWOVSTEN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int answer;
    while (t-- > 0) {
      answer = 0;
      long n = sc.nextLong();
      if (n % 10 == 0) {
        answer = 0;
      } else if (n % 5 != 0) {
        answer = -1;
      } else {
        while (n % 10 != 0) {
          answer += 1;
          n = n * 2;
        }
      }
      System.out.println(answer);
    }
    sc.close();
  }
}
