package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class squawk {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]); //users
        int m = Integer.parseInt(st[1]); //links
        int s = Integer.parseInt(st[2]); //start
        int t = Integer.parseInt(st[3]); //time
        boolean[][] links = new boolean[n][n];
        long[] send = new long[n];
        long[] rec = new long[n];
        rec[s] = 1; //rec writes over send
        for (int i = 0; i < m; i++) {
            st = br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            links[x][y] = true;
            links[y][x] = true;
        }
        for (int i = 0; i <= t; i++) {
            for (int j = 0; j < n; j++) {
                send[j] = rec[j];
                rec[j] = 0;
            }
            for (int j = 0; j < n; j++) {
                if (send[j] > 0) {
                    for (int k = 0; k < n; k++) {
                        if (links[j][k] && k != j) {
                            rec[k] += send[j];
                        }
                    }
                }
            }
        }
        long tot = 0;
        for (int i = 0; i < n; i++) {
            tot += send[i];
        }
        System.out.println(tot);
    }
}
