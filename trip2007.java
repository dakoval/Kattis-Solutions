package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class trip2007 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            int tot = 0;
            while (tot != n) {
                String[] l = br.readLine().split(" ");
                for (int i = 0; i < l.length; i++) {
                    arr[tot++] = Integer.parseInt(l[i]);
                }
            }
            Arrays.sort(arr);
            List<List<Integer>> l = new ArrayList<>();
            int k = 0;
            int cur = Integer.MIN_VALUE;
            int curK = 0;
            l.add(new ArrayList<>());
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                if (x > cur) {
                    cur = x;
                    curK = -1;
                }
                ++curK;
                if (curK > k) {
                    k++;
                    l.add(new ArrayList<>());
                }
                l.get(curK).add(x);
            }
            bw.append(k + 1 + "\n");
            for (int i = 0; i <= k; i++) {
                for (int j : l.get(i)) {
                    bw.append(j + " ");
                }
                bw.append("\n");
            }
            bw.flush();
        }
    }
}
