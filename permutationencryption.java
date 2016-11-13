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
import java.util.*;

public class permutationencryption {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] perm = new int[n];
            for (int i = 0; i < n; i++) {
                perm[i] = sc.nextInt() - 1;
            }
            sc.nextLine();
            String s = sc.nextLine();
            char[] let = s.toCharArray();
            int leng = s.length();
            char[] newlet = new char[leng % n == 0 ? leng : leng + (n - leng % n)];
            for (int i = 0; i < s.length(); i += n) {
                for (int j = 0; j < n; j++) {
                    if ((perm[j] + i) >= leng) {
                        newlet[i + j] = ' ';
                    } else {
                        newlet[i + j] += let[perm[j] + i];
                    }
                }
            }
            pw.print("'");
            for (int i = 0; i < newlet.length; i++) {
                pw.print(newlet[i]);
            }
            pw.print("'\n");
            pw.flush();
        }
    }
}
