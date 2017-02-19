package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class battlesimulation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        char[] c = br.readLine().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i + 2 < c.length && c[i] != c[i + 1] && c[i] != c[i + 2] && c[i + 1] != c[i + 2]) {
                bw.append('C');
                i += 2;
            } else if (c[i] == 'R') {
                bw.append('S');
            } else if (c[i] == 'B') {
                bw.append('K');
            } else if (c[i] == 'L') {
                bw.append('H');
            }
        }
        bw.flush();
    }
}

/*

 */
