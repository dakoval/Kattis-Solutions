/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.io.*;
import java.util.*;

public class secretmessage {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter wr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int c = Integer.parseInt(sc.nextLine());
        for (int a = 0; a < c; a++) {
            char[] s = sc.nextLine().toCharArray();
            int n = (int) Math.sqrt(s.length);
            n = n * n >= s.length ? n : n + 1;
            String st = "";
            for (int i = 0; i < n; i++) {
                int col = n * (n - 1) + i;
                for (int j = 0; j < n; j++) {
                    int row = col - n * j;
                    if (row < s.length) {
                        st += s[row];
                    }
                }
            }
            wr.println(st);
            wr.flush();
        }
    }
}
