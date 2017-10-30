package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class zebrasocelots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tot = 0;
        while (n-- > 0) {
            if (sc.next().equals("O")) {
                tot += 1L << n;
            }
        }
        System.out.println(tot);
    }
}
