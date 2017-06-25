package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class pathtracing {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = br.readLine()) != null) {
            long n = Long.parseLong(s);
            int l = (int) Math.sqrt(n + 1);
            long x = 1;
            for (int i = 2; i <= l; i++) {
                if (n % i == 0) {
                    x += (i + n / i);
                }
            }
            x = n == l * l ? x - l : x;
            s = (x == n) ? "perfect" : Math.abs(x - n) < 3 ? "almost perfect" : "not perfect";
            bw.write(n + " " + s + "\n");
        }
        bw.flush();
    }
}
