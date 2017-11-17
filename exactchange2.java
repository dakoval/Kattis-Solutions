package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class exactchange2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int cost = Integer.parseInt(br.readLine());
            int coins = Integer.parseInt(br.readLine());
            int[] p = new int[coins];
            for (int i = 0; i < coins; i++) {
                p[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(p);
            int[] arr = new int[10001];
            Set<Integer> opt = new HashSet<>();
            for (int i = coins - 1; i >= 0; i--) {
                int coin = p[i];
                arr[coin] = 1;
                Set<Integer> temp = new HashSet<>();
                temp.add(coin);
                for (int c : opt) {
                    int newtot = c + coin;
                    if (newtot <= 10000) {
                        if (arr[newtot] == 0) {
                            arr[newtot] = arr[c] + 1;
                            temp.add(newtot);
                        } else if (arr[newtot] > (arr[c] + 1)) {
                            arr[newtot] = arr[c] + 1;
                        }
                    }
                }

                for (int c : temp) {
                    opt.add(c);
                }
            }
            for (int i = cost; i < 10001; i++) {
                if (arr[i] != 0) {
                    System.out.println(i + " " + arr[i]);
                    break;
                }
            }

        }
    }
}
