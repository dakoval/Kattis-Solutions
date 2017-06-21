package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class cursethedarkness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            double x = sc.nextDouble(), y = sc.nextDouble();
            int c = sc.nextInt();
            boolean l = false;
            while (c-- > 0) {
                double x1 = sc.nextDouble(), y1 = sc.nextDouble();
                double d = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
                if (d <= 8) {
                    l = true;
                }
            }
            if (l) {
                System.out.println("light a candle");
            } else {
                System.out.println("curse the darkness");
            }
        }
    }
}
