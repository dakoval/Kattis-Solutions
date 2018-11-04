package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class kaleidoscopicpalindromes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]), k = Integer.parseInt(line[2]), count = 0;
        while (a <= b) {
            int i = 2;
            for (; i <= k; i++) {
                char[] s = Integer.toString(a, i).toCharArray();
                boolean pal = true;
                for (int j = 0; j < s.length / 2; j++) {
                    if (s[j] != s[s.length - j - 1]) {
                        pal = false;
                    }
                }
                if (!pal) {
                    i = k + 10;
                }
            }
            if (i == k + 1) {
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
