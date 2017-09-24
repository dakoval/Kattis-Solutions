package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class babylonian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.charAt(s.length() - 1) == ',') {
                s += "0";
            }
            int j = 0;
            while (j < s.length() - 1) {
                if (s.charAt(j) == ',' && s.charAt(j + 1) == ',') {
                    s = s.substring(0, j + 1) + "0" + s.substring(j + 1, s.length());
                    j++;
                }
                j++;

            }
            String[] strs = s.split(",");
            long l = 0;
            for (j = 0; j < strs.length; j++) {
                if (!strs[j].equals("0")) {
                    long ll = (long) Math.pow(60, (strs.length - 1 - j));
                    l += (ll * Integer.parseInt(strs[j]));
                }
            }
            System.out.println(l);
        }
    }
}
