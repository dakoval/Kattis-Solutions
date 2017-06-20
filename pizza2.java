package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class pizza2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        if (c == 0) {
            System.out.println(100);
        } else if (r == c) {
            System.out.println(0);
        } else {
            System.out.println((double) 100 * ((r - c) * (r - c)) / (r * r));
        }
    }
}
