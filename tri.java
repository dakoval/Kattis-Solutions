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
public class tri {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(new File("tri"));
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==(b+c)) System.out.println(a+"="+b+"+"+c);
            else if(a==(b-c)) System.out.println(a+"="+b+"-"+c);
            else if(a==(b*c)) System.out.println(a+"="+b+"*"+c);
            else if((a+b)==c) System.out.println(a+"+"+b+"="+c);
            else if((a-c)==c) System.out.println(a+"-"+b+"="+c);
            else if((a*b)==c) System.out.println(a+"*"+b+"="+c);
            else if((a/b)==c && (a%b)==0) System.out.println(a+"/"+b+"="+c);
            else if(a==(b/c)&& (b%c)==0) System.out.println(a+"="+b+"/"+c);
        }
    }
}