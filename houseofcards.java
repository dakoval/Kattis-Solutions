package Solutions;

/**
 *
 * @author Max
 */
import java.math.BigInteger;
import java.util.*;

public class houseofcards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b = new BigInteger(sc.next());
        while (true) {
            BigInteger a = b.multiply(b).add(b).multiply(new BigInteger("3")).divide(new BigInteger("2")).subtract(b).mod(new BigInteger("4"));
            if (a.equals(new BigInteger("0"))) {
                break;
            } else {
                b = b.add(new BigInteger("1"));
            }
        }
        System.out.println(b);
    }
}
