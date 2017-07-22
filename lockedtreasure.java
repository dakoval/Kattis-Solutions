package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class lockedtreasure {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[][] nCk = new long[32][32];
        for (int i = 0; i < 31; i++) {
            nCk[i][1] = 1;
        }
        for (int i = 1; i < 32; i++) {
            for (int j = 1; j <= i; j++) {
                nCk[i][j] = nCk[i - 1][j - 1] + nCk[i - 1][j];
            }
        }
        int c = Integer.parseInt(br.readLine());
        while (c-- > 0) {
            String[] strs = br.readLine().split(" ");
            if (strs[1].equals("1")) {
                bw.write("1\n");
            } else {
                bw.write(nCk[Integer.parseInt(strs[0]) + 1][Integer.parseInt(strs[1])] + "\n");
            }
        }
        bw.flush();
    }
}
