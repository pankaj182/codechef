package easy.p;

import java.util.Scanner;

class PERMUT2 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {

    int size;
    int i, j, num;
    boolean isAmbiguous;
    int[] input = null;

    Scanner sc = new Scanner(System.in);
    while (true) {
      size = sc.nextInt();
      if (size == 0) {
        break;
      }
      isAmbiguous = true;
      input = new int[size + 1];
      input[0] = 0;

      for (i = 1; i <= size; i++) {
        input[i] = sc.nextInt();
      }
      for (i = 1; i <= size; i++) {
        if (input[i] > size || input[i] <= 0 || input[input[i]] != i) {
          isAmbiguous = false;
          break;
        }
      }
      System.out.println(isAmbiguous ? "ambiguous" : "not ambiguous");
    }
    sc.close();
  }
}
