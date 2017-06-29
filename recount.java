package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class recount {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        int max = 0, same = 0;
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            s = br.readLine();
            if (s.equals("***")) {
                break;
            }
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
            if (map.get(s) > max) {
                max = map.get(s);
            }
        }
        for (String st : map.keySet()) {
            if (map.get(st) == max) {
                s = st;
                same++;
            }
        }
        if (same == 1) {
            bw.write(s);
        } else {
            bw.write("Runoff!");
        }
        bw.flush();
    }
}
