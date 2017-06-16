package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class woodcutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();//customers
            long[] times = new long[N];
            for (int i = 0; i < N; i++) {
                int W = sc.nextInt();
                long tempSum = 0;
                for (int j = 0; j < W; j++) {
                    tempSum += sc.nextInt();
                }
                times[i] = tempSum;
            }
            Arrays.sort(times);
            long total = times[0];
            for (int i = 1; i < N; i++) {
                times[i] = times[i] + times[i - 1];
                total += times[i];
            }
            System.out.println((double) total / N);
        }

    }
}
