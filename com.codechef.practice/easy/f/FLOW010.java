package easy.f;

import java.util.Scanner;

class FLOW010 {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    Scanner sc = new Scanner(System.in);
    short t;
    String st;
    t = sc.nextShort();
    while (t-- > 0) {
      st = sc.next();
      if (st.equals("b") || st.equals("B"))
        System.out.println("BattleShip");
      if (st.equals("c") || st.equals("C"))
        System.out.println("Cruiser");
      if (st.equals("d") || st.equals("D"))
        System.out.println("Destroyer");
      if (st.equals("f") || st.equals("F"))
        System.out.println("Frigate");
    }
    sc.close();
  }
}
