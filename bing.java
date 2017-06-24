package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Max
 */
public class bing {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s;
        String[] st;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = s.split("");
            s = map.containsKey(s) ? map.get(s) + "" : "0";
            bw.write(s + "\n");
            s = "";
            for (int j = 0; j < st.length; j++) {
                s += st[j];
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        bw.flush();
    }
}
