package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class permutedarithmeticsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n];
            boolean a = true, b = true;
            l[0] = sc.nextInt();
            l[1] = sc.nextInt();
            int dif = l[0] - l[1];
            for (int i = 2; i < n; i++) {
                l[i] = sc.nextInt();
                if (dif != l[i - 1] - l[i]) {
                    a = false;
                }
            }
            if (!a) {
                Arrays.sort(l);
            }
            dif = l[0] - l[1];
            for (int i = 2; i < n; i++) {
                if (dif != l[i - 1] - l[i]) {
                    b = false;
                    break;
                }
            }
            if (a) {
                System.out.println("arithmetic");
            } else if (b) {
                System.out.println("permuted arithmetic");
            } else {
                System.out.println("non-arithmetic");
            }
        }
    }
}
