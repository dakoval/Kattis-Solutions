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
public class reverserot {
    static char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("reverserot"));
        while(true){
            int x = sc.nextInt();
            if(x==0)break;
            String s=sc.next();
            System.out.println(replaceString(s,x));
        }
    }
    static String replaceString(String s, int c){
        String x ="";
        char[] let = s.toCharArray();
        for(int i=0;i<let.length;i++){
            int place=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==let[i]){
                    place=j;
                    break;
                }
            }
            place= (place+c)%28;
            x=(arr[place]+x);
        }
        return x;
    }
}
