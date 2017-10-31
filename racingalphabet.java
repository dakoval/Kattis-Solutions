package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class racingalphabet {

    static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String st = br.readLine();
            int x = 0;
            int cur = find(st.charAt(0));
            for (int i = 1; i < st.length(); i++) {
                int next = find(st.charAt(i));
                x += Math.min(Math.abs(cur - next), 28 - Math.abs(cur - next));
                cur = next;
            }
            System.out.println(((x * Math.PI) / 7) + st.length());
        }
    }

    static int find(char c) {
        for (int i = 0; i < 28; i++) {
            if (c == s.charAt(i)) {
                return i;
            }
        }
        return 0;
    }
}
