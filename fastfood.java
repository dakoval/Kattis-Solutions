package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class fastfood {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int c = 0; c < tc; c++) {
            int n = sc.nextInt(), m = sc.nextInt() + 1;
            int[] have = new int[m];
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                int t = sc.nextInt() + 1;
                for (int j = 1; j < t; j++) {
                    grid[i][sc.nextInt()] = 1;
                }
                grid[i][0] = sc.nextInt();
            }
            for (int i = 1; i < m; i++) {
                have[i] = sc.nextInt();
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                int min = 100;
                for (int k = 1; k < m; k++) {
                    if (grid[j][k] == 1 && min > have[k]) {
                        min = have[k];
                    }
                }
                max += min * grid[j][0];
            }
            System.out.println(max);
        }
    }
}
