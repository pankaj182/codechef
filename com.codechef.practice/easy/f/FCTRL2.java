package easy.f;

import java.math.BigInteger;
import java.util.Scanner;

class FCTRL2 {

  public static void main(String args[]) {
    solveByBigIntegerMethod();
    // solveUsingArray();
  }

  private static void solveByBigIntegerMethod() {
    Scanner sc = new Scanner(System.in);
    short t, n;
    t = sc.nextShort();
    BigInteger res = new BigInteger("0");
    while (t-- > 0) {
      n = sc.nextShort();
      res = getFactorialByBigInteger(n);
      System.out.println(res);
    }
    sc.close();
  }

  private static BigInteger getFactorialByBigInteger(int n) {
    int i;
    if (n < 0)
      return (new BigInteger(""));
    else if (n == 0 || n == 1)
      return (new BigInteger("1"));
    else {
      BigInteger fact = new BigInteger("1");
      for (i = 2; i <= n; i++)
        fact = fact.multiply(new BigInteger(i + ""));
      return fact;
    }

  }

  private static void solveUsingArray() {
    Scanner sc = new Scanner(System.in);
    short t, n, i;
    t = sc.nextShort();
    while (t-- > 0) {
      n = sc.nextShort();
      int arr[] = new int[400];

      arr[0] = 1;
      short res_size = 1;

      for (int x = 2; x <= n; x++)
        res_size = (short) product(x, arr, res_size);

      for (i = (short) (res_size - 1); i >= 0; i--)
        System.out.print(arr[i]);
      System.out.println();
    }
    sc.close();
  }

  private static int product(int x, int res[], int res_size) {
    int carry = 0;

    for (int i = 0; i < res_size; i++) {
      int prod = res[i] * x + carry;
      res[i] = prod % 10;
      carry = prod / 10;
    }

    while (carry != 0) {
      res[res_size] = carry % 10;
      carry = carry / 10;
      res_size++;
    }
    return res_size;
  }
}
