package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class bela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char Dom = sc.next().charAt(0);
        int tot = 0;
        char[] a1 = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7'};
        int[] d = {11, 4, 3, 20, 10, 14, 0, 0};
        int[] nd = {11, 4, 3, 2, 10, 0, 0, 0};
        for (int i = 0; i < n * 4; i++) {
            String s = sc.next();
            int idx = 0;
            for (int j = 0; j < 8; j++) {
                if (a1[j] == s.charAt(0)) {
                    idx = j;
                }
            }
            if (s.charAt(1) == Dom) {
                tot += d[idx];
            } else {
                tot += nd[idx];
            }
        }
        System.out.println(tot);
    }
}
