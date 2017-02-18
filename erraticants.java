package Solutions;

import java.util.*;

public class erraticants {

    static Point matrix[][];
    static int sx = 200, sy = 200;
    static int xd[] = {0, 2, 0, -2}, yd[] = {2, 0, -2, 0};

    static class Point {

        int x, y, v;
        boolean visit;

        Point(int a, int b, int c, boolean d) {
            x = a;
            y = b;
            v = c;
            visit = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            matrix = new Point[500][500];
            for (int i = 0; i < 500; i++) {
                for (int j = 0; j < 500; j++) {
                    Point p = new Point(j, i, 500, false);
                    matrix[j][i] = p;
                }
            }
            sx = 200;
            sy = 200;
            int dir = 0, n = sc.nextInt();
            matrix[sx][sy].visit = true;
            char let;
            for (int i = 0; i < n; i++) {
                let = sc.next().charAt(0);
                if (let == 'N') {
                    dir = 0;
                }
                if (let == 'E') {
                    dir = 1;
                }
                if (let == 'S') {
                    dir = 2;
                }
                if (let == 'W') {
                    dir = 3;
                }
                matrix[sx + xd[dir] / 2][sy + yd[dir] / 2].visit = true;
                sx += xd[dir];
                sy += yd[dir];
                matrix[sx][sy].visit = true;
            }
            matrix[200][200].v = 0;
            solve(200, 200);
            System.out.println(matrix[sx][sy].v);
        }
    }

    static void solve(int x, int y) {
        int val = matrix[x][y].v;
        for (int i = 0; i < 4; i++) {
            if (matrix[x + xd[i]][y + yd[i]].visit && matrix[x + xd[i]][y + yd[i]].v > (val + 1) && matrix[x + xd[i] / 2][y + yd[i] / 2].visit) {
                matrix[x + xd[i]][y + yd[i]].v = val + 1;
                solve(x + xd[i], y + yd[i]);

            }
        }
    }
}
