package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class backspace {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        char[] n = new char[c.length];
        int p = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                n[p++] = c[i];
            } else {
                if (p > 0) {
                    n[p] = ' ';
                    p--;

                }
                if (i == c.length - 1) {
                    n[p] = ' ';
                }
            }
        }
        String s = new String(n);
        System.out.println(s.trim());
    }
}
