/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author David
 */
import java.util.*;
import java.io.*;
public class pot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int total=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int pow = x%10;
            int num = x/10;
            total+=Math.pow(num, pow);
        }
        System.out.println(total);
    }
}
