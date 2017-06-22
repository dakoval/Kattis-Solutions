package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class watchdog {

    static class Hatch {

        double x, y;

        Hatch(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            int S = Integer.parseInt(st[0]);//S*S roof
            int H = Integer.parseInt(st[1]);//# of hatches
            List<Hatch> l = new ArrayList<>();
            for (int j = 0; j < H; j++) {
                st = br.readLine().split(" ");
                l.add(new Hatch(Integer.parseInt(st[0]), Integer.parseInt(st[1])));
            }
            int sx = -1, sy = -1;
            print:
            for (int x = 1; x < S - 1; x++) {
                for (int y = 1; y < S - 1; y++) {
                    double max = Math.min(Math.min(x, S - x), Math.min(y, S - y));

                    boolean yes = true;
                    for (Hatch h : l) {
                        // System.out.println(x + " " + y + " " + "  = " + max + "  : " + (Math.sqrt((h.x - x) * (h.x - x) + (h.y - y) * (h.y - y))));
                        if ((h.x == x && h.y == y) || max < Math.sqrt((h.x - x) * (h.x - x) + (h.y - y) * (h.y - y))) {
                            yes = false;
                        }
                    }
                    if (yes) {
                        sx = x;
                        sy = y;
                        break print;
                    }
                }
            }

            if (sx == -1 && sy == -1) {
                System.out.println("poodle");
            } else {
                System.out.println(sx + " " + sy);
            }
        }
    }
}
