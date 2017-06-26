package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 *
 * @author Max
 */
public class notamused {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        int day = 1;
        while ((s = br.readLine()) != null) {
            String[] strs;
            Map<String, int[]> map = new HashMap<>();
            List<String> l = new ArrayList<>();
            while (true) {
                strs = br.readLine().split(" ");
                if (strs[0].equals("CLOSE")) {
                    break;
                }
                if (strs[0].equals("ENTER")) {
                    if (map.containsKey(strs[1])) {
                        map.get(strs[1])[0] = Integer.parseInt(strs[2]);
                    } else {
                        int[] x = {Integer.parseInt(strs[2]), 0};
                        map.put(strs[1], x);
                        l.add(strs[1]);
                    }
                } else {
                    map.get(strs[1])[1] += Integer.parseInt(strs[2]) - map.get(strs[1])[0];
                }
            }
            Collections.sort(l);
            bw.write("Day " + (day++) + "\n");
            for (String st : l) {
                double d = map.get(st)[1] * .1;
                bw.write(st + " $" + String.format("%.2f", d) + "\n");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
