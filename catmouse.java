package Solutions;

import java.util.*;

public class catmouse {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double R = sc.nextInt(), t = sc.nextInt(), j = sc.nextInt();
            double ts, js;
            double r = (t * R) / j;
            ts = Math.sqrt(R * R - r * r) / t;
            js = (1.5 * R * Math.PI - R * Math.asin(r / R)) / j;
            if (ts > js) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
