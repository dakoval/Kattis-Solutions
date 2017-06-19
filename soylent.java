package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class soylent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            int n = sc.nextInt();
            n = n % 400 == 0 ? n / 400 : 1 + n / 400;
            System.out.println(n);
        }
    }
}
