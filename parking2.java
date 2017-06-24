package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class parking2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().split(" ");
            int m = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(strs[i]);
                if (x > max) {
                    max = x;
                }
                if (x < min) {
                    min = x;
                }
            }
            bw.write(((max - min) * 2) + "\n");
        }
        bw.flush();
    }
}
