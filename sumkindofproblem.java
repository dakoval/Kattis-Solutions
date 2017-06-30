package Solutions;

import java.io.*;

/**
 *
 * @author Max
 */
public class sumkindofproblem {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs;
        int p = Integer.parseInt(br.readLine());
        while (p-- > 0) {
            strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[1]);
            bw.write(strs[0] + " " + ((n * (n + 1)) / 2) + " " + (n * n) + " " + (n * n + n) + "\n");
        }
        bw.flush();
    }
}
