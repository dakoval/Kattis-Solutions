package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class compromise {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] strs = br.readLine().split(" ");
            int r = Integer.parseInt(strs[0]), c = Integer.parseInt(strs[1]);
            String[][] s = new String[r][c];
            for (int i = 0; i < r; i++) {
                s[i] = br.readLine().split("");
            }
            String st = "";
            for (int i = 0; i < c; i++) {
                int x = 0;
                for (int j = 0; j < r; j++) {
                    if (s[j][i].equals("1")) {
                        x++;
                    }
                }
                st += (r <= x * 2) ? "1" : "0";
            }
            bw.write(st + "\n");
        }
        bw.flush();
    }
}
