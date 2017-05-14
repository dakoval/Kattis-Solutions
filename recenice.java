package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class recenice {

    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loc = 0;
        int x, length = -1;
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            st[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (st[i].equals("$")) {
                loc = i;
            }
            length += st[i].length();
        }
        x = length + 2;
        while (true) {
            String s = check(++x + "");
            if (s.length() + length == x) {
                st[loc] = s;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(st[i] + " ");
        }

    }

    static String check(String x) {
        String s = "";
        int cur = 0;
        if (x.length() > 2) {
            s += ones[Integer.parseInt(x.charAt(0) + "")] + "hundred";
            ++cur;
        }
        if (x.length() == 2 || cur == 1) {
            if (x.charAt(0 + cur) == '1') {
                s += teens[Integer.parseInt(x.charAt(1 + cur) + "")];
            } else {
                s += tens[Integer.parseInt(x.charAt(cur) + "")];
                if (x.charAt(1 + cur) != '0') {
                    s += ones[Integer.parseInt(x.charAt(1 + cur) + "")];
                }
            }
        }
        if (x.length() == 1) {
            s += ones[Integer.parseInt(x)];
        }
        return s;
    }
}
