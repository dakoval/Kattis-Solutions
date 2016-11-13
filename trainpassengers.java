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
import java.io.*;
import java.util.*;
public class trainpassengers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int c = 0;
        int n = sc.nextInt();
        boolean a = true;
        for(int i=0;i<n;i++){
            int left = sc.nextInt();
            if(left>c) a= false;
            int enter = sc.nextInt();
            if(enter>(capacity-(c-left)))a=false;
            int stay = sc.nextInt();
            c = c-left+enter; 
            if(c<0 || c>capacity) a=false;
            if(stay>0 && capacity-c>0) a=false;
        }
        if(a && c==0)System.out.println("possible");
        else System.out.println("impossible");
    }
}
