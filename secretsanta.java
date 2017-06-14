package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class secretsanta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = n > 100000 ? 100000 : n;
        double total = 1;
        double val = 1;
        for (int i = 2; i <= n; i++) {
            val *= i;
            total = i % 2 == 0 ? total - 1 / val : total + 1 / val;
        }
        System.out.println(total);
    }
}
