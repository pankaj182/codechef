package easy.f;

import java.util.Scanner;

class FLOW016 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();

      System.out.println(+gcd(a, b) + " " + lcm(a, b));
      t--;
    }
  }

  static long lcm(long a, long b) {
    return (a * b) / gcd(a, b);
  }

  static long gcd(long a, long b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    if (a == b) {
      return a;
    }
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;

  }
}
