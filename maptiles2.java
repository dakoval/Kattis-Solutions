package Solutions;

import java.util.*;

/**
 *
 * @author Max
 */
public class maptiles2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        String x = "";
        String y = "";
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '0') {
                x += "0";
                y += "0";
            } else if (in[i] == '1') {
                x += "1";
                y += "0";
            } else if (in[i] == '2') {
                x += "0";
                y += "1";
            } else {
                x += "1";
                y += "1";
            }
        }
        System.out.println(in.length + " " + Integer.parseInt(x, 2) + " " + Integer.parseInt(y, 2));
    }
}
