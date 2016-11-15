package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class cups {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].charAt(0) >= 'a' && s[0].charAt(0) <= 'z') {
                map.put(Integer.parseInt(s[1]), s[0]);
                list.add(Integer.parseInt(s[1]));
            } else {
                map.put(Integer.parseInt(s[0]) / 2, s[1]);
                list.add(Integer.parseInt(s[0]) / 2);
            }
        }

        Collections.sort(list);
        for (int x : list) {
            System.out.println(map.get(x));
        }

    }
}
