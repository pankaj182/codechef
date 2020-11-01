package easy.p;

import java.util.Scanner;

class POTATOES {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = 1;
      while (!isPrime(x + y + z))
        z++;
      System.out.println(z);
      t--;
    }
  }

  private static boolean isPrime(int n) {
    if (n == 2 || n == 3 || n == 5 || n == 7) {
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
      return false;
    }
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)
        count = count + 1;
    }
    if (count == 2)
      return true;
    return false;
  }
}
