package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class volim {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine()) - 1;
        int n = Integer.parseInt(br.readLine());
        String[] st;
        int time = 60 * 3 + 30;
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            time -= Integer.parseInt(st[0]);
            if (time >= 0) {
                if (st[1].equals("T")) {
                    start = (start + 1) % 8;
                }
            } else {
                System.out.println(start + 1);
                break;
            }
        }
    }
}
