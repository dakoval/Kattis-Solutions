package Solutions;

import java.util.*;
import java.util.HashMap;

/**
 *
 * @author Max
 */
public class walkway {

    static Map<Integer, List<Trap>> map;
    static Set<Trap> set;
    static double best;

    public static class Trap {

        int a, b, c;

        public Trap(int a, int b, int h) {
            this.a = a;
            this.b = b;
            this.c = (a + b) * h;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            map = new HashMap<Integer, List<Trap>>();
            best = Integer.MAX_VALUE;
            set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                Trap t = new Trap(sc.nextInt(), sc.nextInt(), sc.nextInt());
                if (t.a != t.b) {
                    if (map.containsKey(t.a)) {
                        boolean con = false;
                        for (Trap tt : map.get(t.a)) {
                            if (tt.a == t.a && tt.b == t.a) {
                                con = true;
                                break;
                            }
                        }
                        if (!con) {
                            map.get(t.a).add(t);
                        }
                    } else {
                        List<Trap> l = new ArrayList<>();
                        l.add(t);
                        map.put(t.a, l);
                    }
                    if (map.containsKey(t.b)) {
                        boolean con = false;
                        for (Trap tt : map.get(t.b)) {
                            if (tt.a == t.b && tt.b == t.b) {
                                con = false;
                                break;
                            }
                        }
                        if (!con) {
                            map.get(t.b).add(t);
                        }
                    } else {
                        List<Trap> l = new ArrayList<>();
                        l.add(t);
                        map.put(t.b, l);
                    }
                }
            }
            int start = sc.nextInt();
            int end = sc.nextInt();
            if (start == end) {
                best = 0;
            } else {
                Search(start, end, 0);
            }
            System.out.printf("%.2f\n", best / 100);
        }
    }

    static void Search(int start, int end, double total) {
        if (total > best) {
            return;
        }
        if (start == end) {
            if (total < best) {
                best = total;
            }
        } else if (map.containsKey(start)) {
            for (Trap t : map.get(start)) {
                if (!set.contains(t)) {
                    set.add(t);
                    if (t.a == start) {
                        Search(t.b, end, total + t.c);
                    } else if (t.b == start) {
                        Search(t.a, end, total + t.c);
                    }
                    set.remove(t);
                }
            }
        }
    }
}
