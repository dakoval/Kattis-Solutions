package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class calculatingdartscores {

    static String s = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (0 == dartThrow(dartThrow(dartThrow(n)))) {
            System.out.print(s);
        } else {
            System.out.println("impossible");
        }
    }

    static int dartThrow(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 20) {
            s += ("single " + n + "\n");
            n = 0;
        } else if (n <= 40) {
            s += "double " + (n / 2) + "\n";
            n -= (n / 2) * 2;
        } else if (n <= 60) {
            s += ("triple " + (n / 3) + "\n");
            n -= (n / 3) * 3;
        } else if (n > 60) {
            if ((n - 60) < 38 && (n - 60) % 2 == 1) {
                s += ("triple " + 19 + "\n");
                n -= 57;
            } else {
                s += ("triple " + 20 + "\n");
                n -= 60;
            }
        }
        return n;
    }
}
