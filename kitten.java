package Solutions;

/**
 *
 * @author Max
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class kitten {

    static Map<Integer, Integer> map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();
        int st = Integer.parseInt(br.readLine());
        while (true) {
            String[] c = br.readLine().split(" ");
            int to = Integer.parseInt(c[0]);
            if (to == -1) {
                break;
            }
            for (int i = 1; i < c.length; i++) {
                map.put(Integer.parseInt(c[i]), to);
            }
        }
        dfs(st);
    }

    static void dfs(int s) {
        System.out.print(s + " ");
        if (map.containsKey(s)) {
            dfs(map.get(s));
        }
    }
}
