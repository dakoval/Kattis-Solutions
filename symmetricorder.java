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
public class symmetricorder {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(new File("symmetricorder"));
        int caseCnt=0;
        while(true){
            int n =sc.nextInt();
            if(n == 0)break;
            String a[]=new String[n];
            for(int i=0;i<n/2;i++){
                a[i]=sc.next();
                a[n-i-1]=sc.next();
            }
            if(n%2!=0)a[n/2]=sc.next();
            System.out.println("SET "+ ++caseCnt);
            for(int i=0;i<n;i++)System.out.println(a[i]);     
        }
    }
}
