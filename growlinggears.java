package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class growlinggears {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int g = sc.nextInt();
            double max = Integer.MIN_VALUE;
            int gear = 0;
            for (int i = 0; i < g; i++) {
                double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                double x = b / (2 * a);
                double curGear = -a * x * x + b * x + c;
                if (max < curGear) {
                    max = curGear;
                    gear = i + 1;
                }
            }
            System.out.println(gear);
        }
    }
}
