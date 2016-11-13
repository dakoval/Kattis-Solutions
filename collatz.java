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
import java.util.*;
import java.io.*;

public class collatz {

    static Map<Long, Long> map;

    public static void main(String args[]) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while (true) {
            String[] thro = sc.readLine().split(" ");
            long A = Integer.parseInt(thro[0]);
            long B = Integer.parseInt(thro[1]);
            if (A == 0 && B == 0) {
                break;
            }
            map = new HashMap<>();
            fill(A);
            int cB = -1;
            int num = 0;
            long b = B;
            while (true) {
                ++cB;
                if (map.containsKey(b)) {
                    break;
                }
                if (b == 1) {
                    num = 1;
                    break;
                }
                if (b % 2 == 0) {
                    b = b / 2;
                } else {
                    b = b * 3 + 1;
                }

            }
            pw.println(A + " needs " + map.get(b) + " steps, " + B + " needs " + cB + " steps, they meet at " + b);
            pw.flush();

        }

    }

    static void fill(long x) {
        long i = x;
        long counter = 0;
        map.put(i, counter++);
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i * 3 + 1;
            }
            if (!map.containsKey(i)) {
                map.put(i, counter);
            }
            counter++;
        }
    }
}
