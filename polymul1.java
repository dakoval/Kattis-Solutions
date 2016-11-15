package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class polymul1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int as = sc.nextInt();
            int[] a = new int[as + 1];
            for (int i = 0; i < as + 1; i++) {
                a[i] = sc.nextInt();
            }
            int bs = sc.nextInt();
            int[] b = new int[bs + 1];
            for (int i = 0; i < bs + 1; i++) {
                b[i] = sc.nextInt();
            }
            int output = as + bs;
            int[] c = new int[output + 1];
            for (int i = 0; i < as + 1; i++) {
                for (int j = 0; j < bs + 1; j++) {
                    c[i + j] += a[i] * b[j];
                }
            }
            String s = "";
            for (int i = 0; i < output + 1; i++) {
                s += c[i] + " ";
            }
            System.out.println(output);
            System.out.println(s);
        }
    }
}
