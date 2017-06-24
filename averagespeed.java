package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Max
 */
public class averagespeed {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int curSpeed = 0;
        long time = 0;
        double dist = 0;
        String[] strs;
        String check;
        while ((check = br.readLine()) != null) {
            strs = check.split(" ");
            String[] times = strs[0].split(":");
            long newtime = toSec(Integer.parseInt(times[0]), Integer.parseInt(times[1]), Integer.parseInt(times[2]));
            if (newtime < time) {
                newtime += time;
            }
            dist += (double) (newtime - time) * curSpeed / 3600;
            if (strs.length == 1) {
                bw.write(strs[0] + " " + String.format("%.2f", dist) + " km\n");
            } else {
                curSpeed = Integer.parseInt(strs[1]);
            }
            time = newtime;
        }
        bw.flush();
    }

    static long toSec(int h, int m, int s) {
        long l = h * 60 * 60 + m * 60 + s;
        return l;
    }
}
