package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class flowshop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                matrix[i][j] = sc.nextInt() + Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
            System.out.print(matrix[i][M] + " ");
        }

    }
}
