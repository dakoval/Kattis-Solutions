package Solutions;

/**
 *
 * @author Max
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class autori {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sts = br.readLine().split("-");
        String s = sts[0].charAt(0) + "";
        for (int i = 1; i < sts.length; i++) {
            s += sts[i].charAt(0) + "";
        }
        System.out.println(s);
    }
}
