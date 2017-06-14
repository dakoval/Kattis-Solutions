package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class names {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxl = s.length() / 2 + 1;
        int max = maxl;
        for (int i = 0; i < maxl; i++) {
            int temp = 0;
            for (int j = 0; j < s.length() / 2; j++) {
                if (j < s.length() - j - 1 && (s.charAt(j) != s.charAt(s.length() - j - 1) || s.charAt(s.length() - j - 1) == ' ')) {
                    temp++;
                }
            }
            if (temp < max) {
                max = temp;
            }
            s += " ";
        }
        System.out.println(max);
    }
}
