package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Max
 */
public class oktalni {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("");
        String s = "";
        if (strs.length % 3 == 1) {
            s = "1";
        } else if (strs.length % 3 == 2) {
            s = "" + Integer.parseInt(("01" + strs[1]), 2);
        }
        for (int i = strs.length % 3; i < strs.length; i += 3) {
            s += Integer.parseInt((strs[i] + strs[i + 1] + strs[i + 2]), 2);
        }
        System.out.println(s);
    }
}
