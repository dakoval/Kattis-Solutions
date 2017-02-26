package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class sevenwonders {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int T = 0, C = 0, G = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'T') {
                T++;
            }
            if (c[i] == 'C') {
                C++;
            }
            if (c[i] == 'G') {
                G++;
            }
        }
        int sum = T * T + C * C + G * G;
        int min = (T > C) ? C : T;
        min = (min > G) ? G : min;
        System.out.println(sum + min * 7);

    }
}
