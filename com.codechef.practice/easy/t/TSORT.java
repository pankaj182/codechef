package easy.t;

import java.util.Arrays;
import java.util.Scanner;

class TSORT {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner pp = new Scanner(System.in);
    int n = pp.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = pp.nextInt();
    }
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    pp.close();
  }
}
