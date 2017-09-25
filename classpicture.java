package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class classpicture {

    static int[] order;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        String[] lines;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            order = new int[n];
            int[][] pairs = new int[n][n];
            String[] nameList = new String[n];
            boolean impossible = false, found = false;
            for (int i = 0; i < n; i++) {
                nameList[i] = br.readLine();
            }
            Arrays.sort(nameList);
            Map<Integer, String> i2s = new HashMap<>();
            Map<String, Integer> s2i = new HashMap<>();
            for (int i = 0; i < n; i++) {
                order[i] = i;
                i2s.put(i, nameList[i]);
                s2i.put(nameList[i], i);
            }
            int m = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
                lines = br.readLine().split(" ");
                pairs[s2i.get(lines[0])][s2i.get(lines[1])] = 1;
                pairs[s2i.get(lines[1])][s2i.get(lines[0])] = 1;
            }
            for (int i = 0; i < n; i++) {
                int x = 0;
                for (int j = 0; j < n; j++) {
                    x += pairs[i][j];
                }
                if (x == n - 1 && n != 1) {
                    impossible = true;
                }
            }
            while (!found && !impossible && nextPerm()) {
                boolean valid = true;
                if (order.length == 2) {
                    if (pairs[order[0]][order[1]] == 1) {
                        valid = false;
                    }
                }
                for (int i = 1; i < order.length - 1; i++) {
                    if (pairs[order[i]][order[i - 1]] == 1 || pairs[order[i]][order[i + 1]] == 1) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    found = true;
                }
            }
            if (found) {
                for (int i = 0; i < n; i++) {
                    bw.append(i2s.get(order[i]) + " ");
                }
                bw.append("\n");
            } else {
                bw.append("You all need therapy.\n");
            }
        }
        bw.flush();
    }

    static void swap(int i, int j) {
        int t = order[i];
        order[i] = order[j];
        order[j] = t;
    }

    static boolean nextPerm() {
        int n = order.length;
        int k;
        for (k = n - 2; k >= 0; k--) {
            if (order[k] < order[k + 1]) {
                break;
            }
        }
        if (k == -1) {
            return false;
        }

        int j = n - 1;
        while (order[k] > order[j]) {
            j--;
        }
        swap(j, k);
        for (int r = n - 1, s = k + 1; r > s; r--, s++) {
            swap(r, s);
        }
        return true;
    }
}
