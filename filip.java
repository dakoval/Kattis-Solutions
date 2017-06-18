package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class filip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
