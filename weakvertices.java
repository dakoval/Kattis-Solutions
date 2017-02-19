package Solutions;

import java.util.*;

/**
 *
 * @author Max
 */
public class weakvertices {

    static SortedSet<Integer> reject;
    static Map<Integer, List<Integer>> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            map = new HashMap<>();
            reject = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    int x = sc.nextInt();
                    if (x == 1) {
                        l.add(j);
                    }
                }
                map.put(i, l);
            }
            for (int i = 0; i < n; i++) {
                boolean con = false;
                for (int j : map.get(i)) {
                    for (int k : map.get(j)) {
                        for (int l : map.get(k)) {
                            if (i == l) {
                                con = true;
                                break;
                            }
                        }
                        if (con) {
                            break;
                        }
                    }
                    if (con) {
                        break;
                    }
                }
                if (!con) {
                    reject.add(i);
                }
            }
            for (int i : reject) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
