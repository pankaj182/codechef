package easy.f;

import java.util.Scanner;

class FLOW014 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short test = sc.nextShort();

    boolean h, c, t;
    float hardness, tensile, carbon;
    while (test-- > 0) {
      h = false;
      c = false;
      t = false;
      hardness = sc.nextFloat();
      carbon = sc.nextFloat();
      tensile = sc.nextFloat();
      if (hardness > 50)
        h = true;
      if (carbon < 0.7)
        c = true;
      if (tensile > 5600)
        t = true;

      if (h && t && c)
        System.out.println(10);
      else if (h && c)
        System.out.println(9);
      else if (c && t)
        System.out.println(8);
      else if (h && t)
        System.out.println(7);
      else if ((h && !t && !c) || (!h && t && !c) || (!h && !t && c))
        System.out.println(6);
      else if (!h && !t && !c)
        System.out.println(5);
    }
  }
}
