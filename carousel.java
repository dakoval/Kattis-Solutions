package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class carousel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt(), m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int ba = 0, bb = -1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a <= m) {
                    if ((a * bb == b * ba && a > ba) || ba == 0 || a * bb > b * ba) {
                        ba = a;
                        bb = b;
                    }
                }
            }
            String s = ba > 0 ? "Buy " + ba + " tickets for $" + bb : "No suitable tickets offered";
            System.out.println(s);
        }
    }
}
