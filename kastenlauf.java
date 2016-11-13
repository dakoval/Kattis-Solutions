package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class kastenlauf {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine()) + 2;
            int[] x = new int[n];
            int[] y = new int[n];
            boolean[] vst = new boolean[n];
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split(" ");
                x[i] = Integer.parseInt(temp[0]);
                y[i] = Integer.parseInt(temp[1]);
            }
            q.add(0);
            while (!q.isEmpty()) {
                int p = q.remove();
                if (!vst[p]) {
                    vst[p] = true;
                    for (int i = 0; i < n; i++) {
                        if (p != i) {
                            if ((Math.abs(x[p] - x[i]) + Math.abs(y[p] - y[i])) <= 1000) {
                                q.add(i);
                            }
                        }
                    }
                }
            }
            bw.write(vst[n - 1] ? "happy\n" : "sad\n");
            bw.flush();
        }
    }
}
