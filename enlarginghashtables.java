package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class enlarginghashtables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            boolean nPrime = isPrime(n);
            int x = n;
            n = 2 * n;
            boolean isPrime = false;
            while (!isPrime) {
                isPrime = isPrime(++n);
            }
            if (nPrime) {
                System.out.println(n);
            } else {
                System.out.println(n + " (" + x + " is not prime)");
            }
            n = sc.nextInt();
        }
    }

    static boolean isPrime(int n) {
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
