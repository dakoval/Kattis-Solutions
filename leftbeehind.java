package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class leftbeehind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            if (x + y == 13) {
                System.out.println("Never speak again.");
            } else if (x > y) {
                System.out.println("To the convention.");
            } else if (x < y) {
                System.out.println("Left beehind.");
            } else if (x == y) {
                System.out.println("Undecided.");
            }
        }
    }
}
