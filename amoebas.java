package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class amoebas {

    static char[][] mat;
    static int r, c;
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1}, dy = {1, 1, 1, 0, -1, -1, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        r = Integer.parseInt(strs[0]);
        c = Integer.parseInt(strs[1]);
        mat = new char[r][c];
        for (int i = 0; i < r; i++) {
            mat[i] = br.readLine().toCharArray();
        }
        int tot = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == '#') {
                    tot++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(tot);
    }

    static void dfs(int rr, int cc) {
        mat[rr][cc] = '.';
        for (int i = 0; i < 8; i++) {
            if (valid(rr + dx[i], cc + dy[i]) && mat[rr + dx[i]][cc + dy[i]] == '#') {
                dfs(rr + dx[i], cc + dy[i]);
            }
        }
    }

    static boolean valid(int rr, int cc) {
        if (rr >= 0 && r > rr && cc >= 0 && cc < c) {
            return true;
        }
        return false;
    }
}
