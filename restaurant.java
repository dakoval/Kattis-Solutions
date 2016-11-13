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

public class restaurant {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int a, b;
            a = b = 0;
            String[] l;
            String action;
            int num;
            for (int i = 0; i < n; i++) {
                l = br.readLine().split(" ");
                action = l[0];
                num = Integer.parseInt(l[1]);
                if (action.equals("DROP")) {
                    b += num;
                    bw.write("DROP 2 " + num + "\n");

                } else if (action.equals("TAKE")) {
                    if (a >= num) {
                        a -= num;
                        bw.write("TAKE 1 " + num + "\n");
                    } else {
                        if (a != 0) {
                            bw.write("TAKE 1 " + a + "\n");
                            num -= a;
                            a = 0;
                        }
                        bw.write("MOVE 2->1 " + b + "\n");
                        a = b - num;
                        b = 0;
                        bw.write("TAKE 1 " + num + "\n");
                    }
                }

            }
            bw.write("\n");
            bw.flush();
        }
    }
}
