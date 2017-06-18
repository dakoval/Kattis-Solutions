package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Max
 */
public class grassseed {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(br.readLine());
        int l = Integer.parseInt(br.readLine());
        String[] s;
        double tot = 0;
        for (int i = 0; i < l; i++) {
            s = br.readLine().split(" ");
            tot += Double.parseDouble(s[0]) * Double.parseDouble(s[1]);
        }
        System.out.println(tot * c);
    }
}
