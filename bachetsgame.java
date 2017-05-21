package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class bachetsgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//stones
            int m = sc.nextInt();//# of #s
            int[] moves = new int[m];
            for (int i = 0; i < m; i++) {
                moves[i] = sc.nextInt();
            }
            int[] arr = new int[n + 1];
            arr[0] = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i - moves[j] >= 0 && arr[i - moves[j]] == 0) {
                        arr[i] = 1;
                        break;
                    }
                }
            }
            if (arr[n] == 1) {
                System.out.println("Stan wins");
            } else {
                System.out.println("Ollie wins");
            }
        }
    }
}
