package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class bigtruck {

    static Map<Integer, Point> map;

    static class Point {

        int p;
        int i;
        int d;
        boolean v;
        List<Edge> e;

        Point(int p, int i) {
            this.p = p;
            this.i = i;
            v = false;
            e = new ArrayList<>();
            d = Integer.MAX_VALUE;
        }
    }

    static class Edge {

        int to;
        int d;

        Edge(int to, int dist) {
            this.to = to;
            this.d = dist;
        }
    }
    static int path, items;

    public static void main(String[] args) {
        int n, m, a, b, d;
        Scanner sc = new Scanner(System.in);
        map = new HashMap<>();
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            map.put(i, new Point(i, sc.nextInt()));
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            d = sc.nextInt();
            map.get(a).e.add(new Edge(b, d));
            map.get(b).e.add(new Edge(a, d));
        }
        path = Integer.MAX_VALUE;
        items = Integer.MIN_VALUE;
        map.get(1).v = true;
        map.get(1).d = 0;
        dfs(1, n);
        if (map.get(n).d == Integer.MAX_VALUE) {
            System.out.println("impossible");
        } else {
            System.out.println(path + " " + items);
        }
    }

    static void dfs(int s, int f) {
        if (s == f) {
            if (map.get(s).d < path) {
                path = map.get(s).d;
                items = map.get(s).i;

            } else if (map.get(s).d == path && map.get(s).i > items) {
                items = map.get(s).i;
            }
            return;
        }
        for (Edge e : map.get(s).e) {
            if (!map.get(e.to).v && (e.d + map.get(s).d) <= map.get(e.to).d) {
                map.get(e.to).d = e.d + map.get(s).d;
                map.get(e.to).i += map.get(s).i;
                map.get(e.to).v = true;
                dfs(map.get(e.to).p, f);
                map.get(e.to).v = false;
                map.get(e.to).i -= map.get(s).i;
            }
        }
    }
}
