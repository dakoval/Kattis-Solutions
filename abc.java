package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class abc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        char[] c = sc.next().toCharArray();
        for (int i = 0; i < 3; i++) {
            System.out.print(num[c[i] - 'A'] + " ");
        }
    }
}
