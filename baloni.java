package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class baloni {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = Integer.parseInt(strs[i]);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(vals[i])) {
                map.get(vals[i]).add(i);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(vals[i], l);
            }
        }
        int d = 0;
        for (int i = 0; i < n; i++) {
            int h = vals[i];
            int l = i;
            if (h != 0) {
                d++;
                for (int j = 0; j < map.get(h).size(); j++) {
                    if (map.get(h).get(j) == l) {
                        l = map.get(h).remove(j);
                        vals[i] = 0;
                        break;
                    }
                }
                h--;
            }
            boolean change = true;
            while (change) {
                change = false;
                if (map.containsKey(h) && !map.get(h).isEmpty()) {
                    for (int j = 0; j < map.get(h).size(); j++) {
                        if (map.get(h).get(j) > l) {
                            change = true;
                            l = map.get(h).remove(j);
                            vals[l] = 0;
                            h--;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(d);
    }
}
