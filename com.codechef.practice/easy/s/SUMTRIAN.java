package easy.s;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SUMTRIAN {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    int test;
    int rows;
    int i, j, num;

    List<ArrayList<Integer>> numbers = null;
    List<ArrayList<Integer>> sum = null;

    Scanner sc = new Scanner(System.in);
    test = sc.nextInt();
    while (test-- > 0) {
      rows = sc.nextInt();

      numbers = new ArrayList<>();
      sum = new ArrayList<>();

      for (i = 0; i < rows; i++) {
        numbers.add(new ArrayList<Integer>());
        sum.add(new ArrayList<Integer>());
        for (j = 0; j <= i; j++) {
          num = sc.nextInt();
          numbers.get(i).add(num);

          if (i == rows - 1)
            sum.get(i).add(num);
          else
            sum.get(i).add(0);
        }
      }

      for (i = rows - 2; i >= 0; i--) {
        for (j = 0; j <= i; j++) {
          sum.get(i).add(j, Math.max(sum.get(i + 1).get(j), sum.get(i + 1).get(j + 1)) + numbers.get(i).get(j));
        }
      }
      System.out.println(sum.get(0).get(0));

      numbers = null;
      sum = null;
    }
  }
}
