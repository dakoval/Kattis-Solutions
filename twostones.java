package Solutions;

import java.util.*;

/**
 *
 * @author Max
 */
public class twostones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
