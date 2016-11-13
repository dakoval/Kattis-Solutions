/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;

public class deduplicatingfiles {

    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while (true) {
            int n = Integer.parseInt(sc.readLine());
            if (n == 0) {
                break;
            }
            String file[] = new String[n];
            int[] hash = new int[n];
            for (int i = 0; i < n; i++) {
                file[i] = sc.readLine();
                byte h = 0;
                for (byte b : file[i].getBytes()) {
                    h = (byte) (b ^ h);
                }
                hash[i] = h;
            }
            int u = 0;
            int c = 0;
            for (int i = 0; i < n; i++) {
                boolean x = true;
                for (int j = i + 1; j < n; j++) {
                    if (hash[i] == hash[j]) {
                        c++;
                        if (file[i].equals(file[j])) {
                            x = false;
                            c--;
                        }
                    }
                }
                if (x) {
                    u++;
                }
            }
            pw.println(u + " " + c);
        }
        pw.flush();

    }
}
