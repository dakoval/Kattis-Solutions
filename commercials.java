package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class commercials {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt(), max = Integer.MIN_VALUE, maxEnd = 0;
        for (int i = 0; i < n; i++) {
            maxEnd += (sc.nextInt() - c);
            if (max < maxEnd) {
                max = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        System.out.println(max);
    }
}
