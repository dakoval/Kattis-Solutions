package Solutions;

/**
 *
 * @author David
 */
import java.io.*;

public class pivot {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] c = br.readLine().split(" ");
        int a[] = new int[n];
        int b[] = new int[n];
        int ans = 0;
        for (int i = 0, max = Integer.MIN_VALUE; i < n; i++) {
            a[i] = Integer.parseInt(c[i]);
            b[i] = max;
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = n - 1, min = Integer.MAX_VALUE; i >= 0; i--) {
            if (a[i] > b[i] && a[i] < min) {
                ans++;
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(ans);
    }
}
