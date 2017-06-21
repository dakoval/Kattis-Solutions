/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class triangleornaments {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double L = 0.0;
        for (int i = 0; i < n; i++) {
            String st[] = br.readLine().split(" ");
            double A = Integer.parseInt(st[0]), B = Integer.parseInt(st[1]), C = Integer.parseInt(st[2]);//Take in input
            if (A < B) {
                double temp = A;
                A = B;
                B = temp;
            }
            double c = Math.acos((A * A + B * B - C * C) / (2 * A * B));
            double b = Math.acos((A * A + C * C - B * B) / (2 * A * C));
            double bx = A * Math.cos(b) + 100, by = A * Math.sin(b);
            double Ox = (0 + bx + C + 200) / 3, Oy = (0 + by + 0) / 3;
            double newAngle = Math.PI / 2 - b;
            double degChange = newAngle - Math.atan(Math.abs(Ox - bx) / Math.abs(Oy - by));
            double v = Math.abs(A * Math.sin(degChange));
            L += (v * 2);
        }
        bw.write(L + "");
        bw.flush();
    }
}
