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
public class bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
           double p =0; 
           int m=sc.nextInt();
           for(int j=0;j<m;j++)p=(p+.5)*2;
           System.out.println((int)p);
        }
    }
}
