package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class semafori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), time = 0, pre = 0;
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(), r = sc.nextInt(), g = sc.nextInt();
            time += (d - pre);
            int t = time % (r + g);
            if (t <= r) {
                time += (r - t);
            }
            pre = d;
        }
        System.out.println(time + (l - pre));
    }
}
