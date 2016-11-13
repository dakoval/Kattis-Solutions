package Solutions;

/**
 *
 * @author kovalda
 */
import java.util.*;

public class breakingbad {

    static HashMap<String, Set<String>> map;
    static Set<String> a, b;
    static List<String> l;
    static boolean possible;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new HashMap<>();
        a = new HashSet<>();
        b = new HashSet<>();
        possible = true;
        l = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            map.put(s, new HashSet<>());
            l.add(s);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            String x = sc.next();
            String y = sc.next();
            map.get(x).add(y);
            map.get(y).add(x);
        }
        for (String s : l) {
            dfs(s);
        }

        if (possible) {
            for (String s : a) {
                System.out.print(s + " ");
            }
            System.out.println();
            for (String s : b) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("impossible");
        }

    }

    static boolean dfs(String s) {
        if (!a.contains(s) && !b.contains(s)) {
            a.add(s);
        }
        for (String st : map.get(s)) {
            if (a.contains(s) && !a.contains(st) && !b.contains(st)) {
                b.add(st);
                dfs(st);
            } else if (b.contains(s) && !b.contains(st) && !a.contains(st)) {
                a.add(st);
                dfs(st);
            } else if ((b.contains(s) && b.contains(st)) || (a.contains(s) && a.contains(st))) {
                possible = false;
            }
        }
        return true;
    }
}
