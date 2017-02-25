package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class mazemakers {

    static int a1, a2, a3, y, x;
    static char[][] mchar;//entire program will be sideways
    static String[][] m;
    static boolean[][] v;
    static int x1[] = {0, 1, 0, -1};
    static int y1[] = {-1, 0, 1, 0};

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            y = sc.nextInt();
            x = sc.nextInt();
            sc.nextLine();
            if (y == 0 || x == 0) {
                break;
            }
            a1 = a2 = a3 = 0;
            mchar = new char[y][x];
            v = new boolean[y][x];
            m = new String[y][x];
            for (int i = 0; i < y; i++) {
                mchar[i] = sc.nextLine().toCharArray();
            }
            String s;
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    s = "0000" + Integer.toBinaryString(Integer.parseInt(mchar[i][j] + "", 16));
                    m[i][j] = s.substring(s.length() - 4, s.length());
                }
            }
            int ys = -1, xs = -1;
            for (int i = 0; i < y; i++) {
                if (m[i][0].charAt(3) == '0') {
                    xs = 0;
                    ys = i;
                }
                if (m[i][x - 1].charAt(1) == '0') {
                    xs = x - 1;
                    ys = i;
                }
            }
            for (int i = 0; i < x; i++) {
                if (m[0][i].charAt(0) == '0') {
                    xs = i;
                    ys = 0;
                }
                if (m[y - 1][i].charAt(2) == '0') {
                    xs = i;
                    ys = y - 1;
                }
            }
            v[ys][xs] = true;
            dfs(ys, xs);
            if (a1 != 2) {
                System.out.println("NO SOLUTION");
            } else if (a2 != x * y) {
                System.out.println("UNREACHABLE CELL");
            } else if (a3 != 0) {
                System.out.println("MULTIPLE PATHS");
            } else {
                System.out.println("MAZE OK");
            }
        }
    }

    static void dfs(int ys, int xs) {
        ++a2;
        int paths = 0;
        for (int i = 0; i < 4; i++) {
            if (m[ys][xs].charAt(i) == '0') {
                if (ys + y1[i] == y || ys + y1[i] == -1 || xs + x1[i] == x || xs + x1[i] == -1) {
                    a1++;
                } else if (v[ys + y1[i]][xs + x1[i]] == true) {
                    paths++;
                } else {
                    v[ys + y1[i]][xs + x1[i]] = true;
                    dfs(ys + y1[i], xs + x1[i]);
                }
            }
        }
        if (paths > 1) {
            a3++;
        }
    }
}
