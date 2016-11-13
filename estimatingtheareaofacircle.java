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
import java.math.*;
public class estimatingtheareaofacircle {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        while(true){
            double r=sc.nextDouble();int m=sc.nextInt(),c=sc.nextInt();
            if(r==0&&m==0&c==0)break;
            System.out.println(r*r*Math.PI+" "+4*r*r*c/m);
        }
    }
}
