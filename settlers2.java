package Solutions;

import java.io.*;
import java.util.*;

public class settlers2 {

    final static int MAXN = 10000;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int[][] board = new int[250][250];
        int[] tiles = new int[2 * MAXN];
        int x = 125, y = 125;
        int[] cnt = new int[6];
        int[] dx = new int[6];
        int[] dy = new int[6];
        dx[0] = 1;dy[0] = 1;
        dx[1] = 0;dy[1] = 2;
        dx[2] = -1;dy[2] = 1;
        dx[3] = -1;dy[3] = -1;
        dx[4] = 0;dy[4] = -2;
        dx[5] = 1;dy[5] = -1;
        int dist = 1, n = 1;
        board[x][y] = cnt[1] = tiles[1] = 1;
        while (n < MAXN) {
            for (int i = 0; i < 6; ++i) {
                for (int j = (i == 1 ? 1 : 0); j < dist; ++j) {
                    x += dx[i];
                    y += dy[i];
                    boolean[] have = new boolean[6];
                    for (int k = 0; k < 6; ++k) {
                        int tx = x + dx[k];
                        int ty = y + dy[k];
                        have[(int) board[tx][ty]] = true;
                    }
                    int place = 1;
                    for (int k = 2; k < 6; ++k) {
                        if (have[place] || (!have[k] && cnt[k] < cnt[place])) {
                            place = k;
                        }
                    }
                    board[x][y] = place;
                    ++cnt[place];
                    tiles[++n] = place;
                }
            }
            ++dist;
        }
        int c = sc.nextInt();
        while (c-- > 0) {
            n = sc.nextInt();
            pw.println(tiles[n]);
        }
        pw.flush();
    }
}
