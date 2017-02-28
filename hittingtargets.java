package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class hittingtargets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ob = sc.nextInt();
        int[][] mat = new int[2001][2001];
        while (ob-- > 0) {
            String s = sc.next();
            if (s.equals("rectangle")) {
                int sx = sc.nextInt(), sy = sc.nextInt(), ex = sc.nextInt(), ey = sc.nextInt();
                for (int i = sx; i <= ex; i++) {
                    for (int j = sy; j <= ey; j++) {
                        if (i >= -1000 && i <= 1000 && j >= -1000 && j <= 1000) {
                            mat[i + 1000][j + 1000]++;
                        }

                    }
                }
            } else {
                int sx = sc.nextInt(), sy = sc.nextInt(), r = sc.nextInt();
                for (int i = sx - r; i <= sx + r; i++) {
                    for (int j = sy - r; j <= sy + r; j++) {
                        if (Math.sqrt((sx - i) * (sx - i) + (sy - j) * (sy - j)) <= r) {
                            if (i >= -1000 && i <= 1000 && j >= -1000 && j <= 1000) {
                                mat[i + 1000][j + 1000]++;
                            }
                        }
                    }
                }
            }
        }
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println(mat[sc.nextInt() + 1000][sc.nextInt() + 1000]);
        }
    }
}
