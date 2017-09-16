package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class busyschedule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) {
                break;
            }
            int[] times = new int[n];
            for (int i = 0; i < n; i++) {
                int t = 0;
                String[] AMPM = sc.nextLine().split(" ");
                if (AMPM[1].equals("p.m.")) {
                    t = 12 * 60;
                }
                String[] hm = AMPM[0].split(":");
                if (hm[0].equals("12") && AMPM[1].equals("a.m.") || hm[0].equals("12") && AMPM[1].equals("p.m.")) {
                    //skip
                } else {
                    t += Integer.parseInt(hm[0]) * 60;
                }
                t += Integer.parseInt(hm[1]);
                times[i] = t;
            }
            Arrays.sort(times);
            for (int i = 0; i < n; i++) {
                int h = times[i] / 60;
                int m = times[i] % 60;
                if (h < 12) {
                    if (h == 0) {
                        System.out.println("12:" + String.format("%02d", m) + " a.m.");
                    } else {
                        System.out.println(h + ":" + String.format("%02d", m) + " a.m.");
                    }
                } else if (h == 12) {
                    System.out.println(h + ":" + String.format("%02d", m) + " p.m.");
                } else {
                    System.out.println((h - 12) + ":" + String.format("%02d", m) + " p.m.");
                }
            }
            System.out.println();
        }
    }
}
