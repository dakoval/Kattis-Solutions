package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Max
 */
public class treasurehunt {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int r = Integer.parseInt(strs[0]), c = Integer.parseInt(strs[1]);
        String[][] s = new String[r][c];
        for (int i = 0; i < r; i++) {
            s[i] = br.readLine().split("");
        }
        int curC = 0, curR = 0, moves = 0;
        for (int i = 0; i < r * c; i++) {
            if (curR < 0 || curC < 0 || curR > r - 1 || curC > c - 1) {
                System.out.println("Out");
                break;
            } else if (s[curR][curC].equals("T")) {
                System.out.println(moves);
                break;
            } else if (s[curR][curC].equals(".")) {
                System.out.println("Lost");
                break;
            } else {
                String st = s[curR][curC];
                moves++;
                s[curR][curC] = ".";
                if (st.equals("N")) {
                    curR--;
                } else if (st.equals("S")) {
                    curR++;
                } else if (st.equals("W")) {
                    curC--;
                } else if (st.equals("E")) {
                    curC++;
                }
            }
        }
    }
}
