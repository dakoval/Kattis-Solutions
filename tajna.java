package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class tajna {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = (int) Math.sqrt(s.length() + .00001);
        int r = n, c = 1;
        for (int i = n; i > 0; i--) {
            if (s.length() % i == 0) {
                r = i;
                c = s.length() / i;
                break;
            }
        }
        char l[][] = new char[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                l[j][i] = s.charAt(j * r + i);
            }
        }
        s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                s += l[j][i];
            }
        }
        System.out.println(s);
    }
}
