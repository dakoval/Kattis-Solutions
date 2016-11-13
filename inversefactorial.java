package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class inversefactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextLine().length();
        System.out.println(x);
        int y = 0;
        for (int i = 11; i < 1000000; i++) {
            y += Math.log(i);
            if (x == y) {
                System.out.println("ANSWER " + i);
                break;
            }

        }
    }
}
