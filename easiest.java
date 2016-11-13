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
public class easiest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("easiest"));
        while(true){
            int x= sc.nextInt();
            if(x==0)break;
            int y=10;
            while(true){
                if(check(x)==check(++y*x))break;
            }
            System.out.println(y);
        }
    }
    static int check(int cnt){
        int sum=0;
        char[] arr=Integer.toString(cnt).toCharArray();
        for(int i=0; i<arr.length;i++){
            sum+=Integer.parseInt(""+arr[i]);
        }
        return sum;
    }
    
}
