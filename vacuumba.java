package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class vacuumba {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            double m = Integer.parseInt(br.readLine());
            double x = 0, y = 0, d = 90;
            String s[];
            for (int j = 0; j < m; j++) {
                s = br.readLine().split(" ");
                d = (d + Double.parseDouble(s[0])) % 360;
                y += Math.sin(d * Math.PI / 180) * Double.parseDouble(s[1]);
                x += Math.cos(d * Math.PI / 180) * Double.parseDouble(s[1]);
            }
            System.out.printf("%.8f %.8f\n", x, y);
        }
    }
}
