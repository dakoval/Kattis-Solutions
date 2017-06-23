package Solutions;

/**
 *
 * @author Max
 */
import java.math.BigInteger;
import java.util.*;

public class character {

    static BigInteger[] seq = new BigInteger[31];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seq[1] = new BigInteger("1");
        for (int i = 2; i < 31; i++) {
            seq[i] = new BigInteger(i + "").multiply(seq[i - 1]);
        }
        int n = sc.nextInt();
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            ans = ans.add(seq[n].divide(seq[i].multiply(seq[n - i])));
        }
        ans = n > 1 ? ans : new BigInteger("0");
        System.out.println(ans);
    }
}
