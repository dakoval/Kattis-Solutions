package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class encodedmessage {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] s = br.readLine().split("");
            int x = (int) Math.sqrt(s.length);
            for (int i = x - 1; i >= 0; i--) {
                for (int j = 0; j < x; j++) {
                    bw.write(s[j * x + i]);
                }
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
