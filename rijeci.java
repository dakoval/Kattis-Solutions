/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author kovalda
 */
import java.util.*;
import java.io.*;

public class rijeci {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int press = sc.nextInt();
            int A = 1;
            int B = 0;
            for (int i = 0; i < press; i++) {
                int temp = B;
                B = +A;
                A += temp;
            }
            System.out.println(A - B + " " + B);
        }
    }
}
