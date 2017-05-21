package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class cardtrick2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] cards = new int[n];
            int idx = 1 % n;
            cards[idx] = 1;
            for (int j = 2; j <= n; j++) {
                for (int k = 0; k <= j; k++) {
                    idx = (idx + 1) % n;
                    while (cards[(idx)] != 0) {
                        idx = (idx + 1) % n;
                    }
                }
                cards[idx] = j;
            }
            System.out.println(Arrays.toString(cards).replace(",", "").replace("]", "").replace("[", ""));
        }
    }
}
