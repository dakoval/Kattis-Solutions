package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class welcomeeasy {

    static char[] goal = "welcome to code jam".toCharArray();

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        int c = 0;
        for (int i = 0; i < T; i++) {
            char[] line = in.readLine().toCharArray();
            System.out.printf("Case #%d: %04d \n", ++c, permutations(0, 0, line));
        }
    }

    static int permutations(int a, int b, char[] line) {
        if (b == goal.length) {
            return 1;
        } else if (a == line.length) {
            return 0;
        }
        int tot = permutations(a + 1, b, line);
        if (line[a] == goal[b]) {
            tot += permutations(a + 1, b + 1, line);
        }
        return tot;
    }
}
