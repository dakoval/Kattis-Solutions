package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class sibice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        double x = Math.sqrt(w * w + h * h);
        for (int i = 0; i < n; i++) {
            if (x >= sc.nextInt()) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
