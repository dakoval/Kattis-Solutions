package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class gettowork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int C = 1; C <= c; C++) {
            boolean possible = true;
            int n = sc.nextInt();//number of towns
            List<List<Integer>> towns = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                towns.add(new ArrayList<>());
            }
            int[] cars = new int[n];
            int t = sc.nextInt() - 1;//destination town
            int e = sc.nextInt(); //number of employees
            for (int i = 0; i < e; i++) {
                towns.get(sc.nextInt() - 1).add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                Collections.sort(towns.get(i), Collections.reverseOrder());
                int need = towns.get(i).size(), j = 0, k = need;
                if (i != t) {
                    while (j < k && need > 0) {
                        need -= towns.get(i).get(j++);
                        cars[i]++;
                    }
                    if (need > 0) {
                        possible = false;
                    }
                }
            }
            System.out.print("Case #" + C + ": ");
            if (possible) {
                for (int i = 0; i < n; i++) {
                    System.out.print(cars[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
