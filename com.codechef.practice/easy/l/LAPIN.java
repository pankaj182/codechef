package easy.l;

import java.util.Scanner;

class LAPIN {
  public static void main(String[] args) {
    solve();
  }

  private static void solve() {
    short t, i;
    String st = "";
    char ch;
    Scanner sc = new Scanner(System.in);
    t = sc.nextShort();
    boolean flag;
    short st1[] = new short[26];
    short st2[] = new short[26];
    while (t-- > 0) {
      flag = true;
      st = sc.next();

      for (i = 0; i < 26; i++) {
        st1[i] = 0;
        st2[i] = 0;
      }
      for (i = 0; i < st.length(); i++) {
        ch = st.charAt(i);
        if (i < st.length() / 2)
          st1[ch - 97]++;

        else if (i >= Math.ceil((st.length() / 2.0)))
          st2[ch - 97]++;
      }
      for (i = 0; i < 26; i++) {
        if (st1[i] != st2[i]) {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
