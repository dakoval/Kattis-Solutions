package Solutions;

/**
 *
 * @author Max
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fastfood {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        for (int c = 0; c < tc; c++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]) + 1;
            int[] have = new int[m];
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                str = br.readLine().split(" ");
                int t = Integer.parseInt(str[0]) + 1;
                for (int j = 1; j < t; j++) {
                    grid[i][Integer.parseInt(str[j])] = 1;
                }
                grid[i][0] = Integer.parseInt(str[t]);
            }
            str = br.readLine().split(" ");
            for (int i = 1; i < m; i++) {
                have[i] = Integer.parseInt(str[i - 1]);
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
