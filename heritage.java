package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class heritage {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, BigInteger> vals = new HashMap<>();
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        String name = strs[1];
        List<String>[] list = new ArrayList[name.length() + 1];
        BigInteger[] curVals = new BigInteger[name.length() + 1];
        for (int i = 0; i < name.length() + 1; i++) {
            list[i] = new ArrayList<>();
            curVals[i] = new BigInteger("0");
        }

        for (int i = 0; i < n; i++) {
            strs = br.readLine().split(" ");
            String w = strs[0];
            vals.put(w, new BigInteger(strs[1]));
            int nameIdx, wIdx;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == w.charAt(0)) {
                    if (w.length() == 1) {
                        list[j].add(w);
                    } else {
                        nameIdx = j;
                        wIdx = 0;
                        while (nameIdx < name.length() && wIdx < w.length()) {
                            if (name.charAt(nameIdx) == w.charAt(wIdx)) {
                                ++nameIdx;
                                ++wIdx;
                            } else {
                                break;
                            }
                            if ((nameIdx == name.length() && wIdx == w.length()) || wIdx == w.length()) {
                                list[j].add(w);
                            }
                        }
                    }
                }
            }
        }
        for (String st : list[0]) {
            curVals[st.length()] = curVals[st.length()].add(vals.get(st));
        }
        for (int i = 0; i < name.length(); i++) {
            for (String st : list[i]) {
                if (i + st.length() <= name.length()) {
                    curVals[i + st.length()] = curVals[i + st.length()].add(curVals[i].multiply(vals.get(st)));
                }

            }
        }
        System.out.println(curVals[name.length()].mod(new BigInteger("1000000007")));
    }
}
