package Solutions;

import java.util.*;

/**
 *
 * @author Max
 */
public class mirror {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 1; i <= c; i++) {
            String r[] = new String[sc.nextInt()];
            int rp = r.length - 1;
            sc.nextLine();
            System.out.println("Test " + i);
            for (int j = 0; j < r.length; j++) {
                String s = "", st = sc.nextLine();
                for (int k = st.length() - 1; k >= 0; k--) {
                    s += st.charAt(k);
                }
                r[rp--] = s;
            }
            for (int j = 0; j < r.length; j++) {
                System.out.println(r[j]);
            }
        }
    }
}
