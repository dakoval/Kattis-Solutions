package Solutions;

/**
 *
 * @author Max
 */
import java.io.InputStreamReader;
import java.util.*;

public class ants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int len = sc.nextInt(), n = sc.nextInt(), min = 0;
            int[] ants = new int[n];
            for (int i = 0; i < n; i++) {
                ants[i] = sc.nextInt();
                min = Math.max(Math.min(ants[i], len - ants[i]), min);
            }
            Arrays.sort(ants);
            int[] max = {ants[0], ants[n - 1], len - ants[0], len - ants[n - 1]};

            Arrays.sort(max);
            System.out.println(min + " " + max[3]);
        }
    }
}
