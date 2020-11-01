package easy.c;

import java.util.Arrays;
import java.util.Scanner;

class COPS {
  public static void main(String[] args) {
    Scanner sc = null;
    int testCases;
    int copsCount;
    int speed;
    int time;
    int range;
    boolean[] houses = null;
    int[] cops = null;
    try {
      sc = new Scanner(System.in);

      testCases = sc.nextInt();
      houses = new boolean[101];
      while (testCases-- > 0) {
        copsCount = sc.nextInt();
        speed = sc.nextInt();
        time = sc.nextInt();

        cops = new int[copsCount];
        range = speed * time;

        Arrays.fill(houses, true);     // true: available for thief
        houses[0] = false;              // false: under cops coverage

        for (int i = 0; i < copsCount; i++) {
          cops[i] = sc.nextInt(); // cops present
        }
        for (int i = 0; i < copsCount; i++) {
          fillInRange(houses, cops[i] - range, cops[i] + range, false);
        }
        int count = occurencesInArray(houses, true);
        System.out.println(count);
      }
    } catch (Exception e) {

    } finally {
      sc.close();
    }
  }

  private static void fillInRange(boolean[] arr, int from, int to, boolean value) {
    if (from <= to) {

      if (from < 0)
        from = 0;
      if (to >= arr.length)
        to = arr.length - 1;

      for (int i = from; i <= to; i++)
        arr[i] = value;
    } else {
      throw new IllegalArgumentException();
    }
  }

  protected static int occurencesInArray(boolean[] arr, boolean value) {
    int count = 0;
    for (boolean val : arr) {
      if (val == value)
        count++;
    }
    return count;
  }
}
