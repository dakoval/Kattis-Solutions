package Solutions;

import java.util.*;

public class tsp {

    static int[] order;
    static boolean[] visited;
    static Point[] points;

    public static class Point {

        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        points = new Point[n];
        for (int i = 0; i < n; i++) {
            Point p = new Point(sc.nextDouble(), sc.nextDouble());
            points[i] = p;
        }
        visited = new boolean[n];
        order = new int[n];
        visited[0] = true;
        order[0] = 0;
        search(0, 1);
        for (int i = 0; i < n; i++) {
            System.out.println(order[i]);
        }

    }

    static void search(int start, int n) {
        if (n == points.length) {
            return;
        }
        double dis = Integer.MAX_VALUE;
        int best = -1;
        for (int i = 0; i < points.length; i++) {
            if (!visited[i]) {
                double d = Math.sqrt(Math.pow(points[start].x - points[i].x, 2.0) + Math.pow(points[start].y - points[i].y, 2.0));
                if (d < dis) {
                    dis = d;
                    best = i;
                }
            }
        }
        visited[best] = true;
        order[best] = n;
        search(best, ++n);
    }
}
