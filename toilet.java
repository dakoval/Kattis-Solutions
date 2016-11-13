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
public class toilet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x=sc.next();int a=0,b=0,c=0;
        char y =x.charAt(0);
        if(y=='U'&&x.charAt(1)=='D'){a+=2;b++;c++;}
        if(y=='D'&&x.charAt(1)=='U'){b+=2;a++;c++;}
        if(y=='U'&&x.charAt(1)=='U'){b++;}
        if(y=='D'&&x.charAt(1)=='D'){a++;}
        for(int i=2;i<x.length();i++){
            y=x.charAt(i-1);
            if(x.charAt(i)=='U'){
                b+=2;
                if(y=='D')c++;
            }else{
                a+=2;
                if(y=='U')c++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
