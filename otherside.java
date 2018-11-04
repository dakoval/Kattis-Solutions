package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class otherside {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int w = Integer.parseInt(line[0]), s = Integer.parseInt(line[1]), c = Integer.parseInt(line[2]), k = Integer.parseInt(line[3]);
        boolean valid = false;
        if (k > s) {
            valid = true;
        } else if (k == s) {
            if (w + c < k) {
                valid = true;
            } else if (w + c == k) {
                valid = true;
            } else if (w == k && c == k) {
                valid = true;
            } else if (w + c <= 2 * k) {
                valid = true;
            }
        } else if (w + c < k) {
            valid = true;
        } else if (w + c == k && s <= 2 * k) {
            valid = true;
        }
        System.out.println(valid ? "YES" : "NO");
    }
}
