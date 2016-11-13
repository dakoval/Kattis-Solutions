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
public class kornislav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        for(int i=0;i<4;i++)a[i]= sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[0]*a[2]);
    }
}
