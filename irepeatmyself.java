package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class irepeatmyself {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] str = br.readLine().split("");
            String s = "";
            Loop:
            for (int i = 0; i < str.length; i++) {
                s += str[i];
                boolean same = true;
                int aIdx = 0;
                for (int j = 0; j < str.length; j++) {
                    if (s.charAt(aIdx++ % s.length()) != str[j].charAt(0)) {
                        same = false;
                        break;
                    }
                }
                if (same) {
                    bw.write((i + 1) + "\n");
                    break Loop;
                }
            }
        }
        bw.flush();
    }
}
