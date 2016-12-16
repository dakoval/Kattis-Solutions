package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            list.add(Double.parseDouble(s[1]));
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < n; i++) {
            total += list.get(i) * (i + 1);
        }
        System.out.println(total);
    }
}
