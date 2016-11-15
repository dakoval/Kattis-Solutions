package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class closestsums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while (sc.hasNext()) {

            int n = sc.nextInt(); //number of distinct numbers
            int[] an = new int[n];
            for (int i = 0; i < n; i++) {
                an[i] = sc.nextInt();
            }
            int m = sc.nextInt(); //number of queries
            int[] am = new int[m];
            for (int i = 0; i < m; i++) {
                am[i] = sc.nextInt();
            }
            System.out.println("Case " + c++ + ":");
            for (int x = 0; x < m; x++) {
                int min = Integer.MAX_VALUE;
                int place = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            int y = Math.abs(an[i] + an[j] - am[x]);
                            if (y < min) {
                                min = y;
                                place = an[i] + an[j];
                            }
                        }
                    }
                }
                System.out.println("Closest sum to " + am[x] + " is " + place + ".");
            }

        }

    }
}
