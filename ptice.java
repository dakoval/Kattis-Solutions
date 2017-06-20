package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class ptice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = {'A', 'B', 'C'}, B = {'B', 'A', 'B', 'C'}, C = {'C', 'C', 'A', 'A', 'B', 'B'};
        int n = sc.nextInt();
        char[] l = sc.next().toCharArray();
        int a = 0, b = 0, c = 0, max;
        for (int i = 0; i < n; i++) {
            if (A[i % 3] == l[i]) {
                a++;
            }
            if (B[i % 4] == l[i]) {
                b++;
            }
            if (C[i % 6] == l[i]) {
                c++;
            }
        }
        max = Math.max(a, Math.max(b, c));
        System.out.println(max);
        if (a == max) {
            System.out.println("Adrian");
        }
        if (b == max) {
            System.out.println("Bruno");
        }
        if (c == max) {
            System.out.println("Goran");
        }
    }
}
