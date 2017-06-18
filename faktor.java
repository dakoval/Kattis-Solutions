package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), i = sc.nextInt();
        int x = a * i;
        while (((double) --x / a) > i - 1) {
        }
        System.out.println(++x);
    }
}
