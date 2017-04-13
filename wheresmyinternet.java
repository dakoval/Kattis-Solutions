package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class wheresmyinternet {

    static boolean[] visited;
    static Map<Integer, Set<Integer>> map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] l = br.readLine().split(" ");
        int n = Integer.parseInt(l[0]), m = Integer.parseInt(l[1]), a, b, t = 0;
        map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            map.put(i, new HashSet<>());
        }
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            l = br.readLine().split(" ");
            a = Integer.parseInt(l[0]);
            b = Integer.parseInt(l[1]);
            map.get(a).add(b);
            map.get(b).add(a);
        }
        dfs(1);
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                t++;
                break;
            }
        }
        if (t > 0) {
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    bw.append(i + "\n");
                }
            }
            bw.flush();
        } else {
            System.out.println("Connected");
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        for (Integer i : map.get(start)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
