package easy.g;

import java.util.Scanner;

class GDOG {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int maxCoins = 0;
      for (int i = 2; i <= k; i++) {
        if (n % i > maxCoins) {
          maxCoins = n % i;
        }
      }
      System.out.println(maxCoins);
    }
    sc.close();
  }
}
