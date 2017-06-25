package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class natrij {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(":");
        long l1 = toSec(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        s = br.readLine().split(":");
        long l2 = toSec(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])) + 24 * 60 * 60;
        l2 -= l1;
        String st = toStandard(l2);
        st = st.equals("00:00:00") ? "24:00:00" : st;
        bw.write(st);
        bw.flush();
    }

    static long toSec(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    static String toStandard(long l) {
        String s = (int) l % 60 + "";
        String m = (int) ((l % 3600) / 60) + "";
        String h = (int) (l / 3600) % 24 + "";
        s = s.length() == 2 ? s : "0" + s;
        m = m.length() == 2 ? m : "0" + m;
        h = h.length() == 2 ? h : "0" + h;
        return h + ":" + m + ":" + s;
    }
}
