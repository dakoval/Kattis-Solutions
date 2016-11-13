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
public class synchronizinglists {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("synchronizinglists"));
        while(true){
            int n=sc.nextInt();
            if(n==0)break;
            int[] first=new int[n],second=new int[n]; 
            for(int i=0;i<n;i++) first[i]=sc.nextInt();
            for(int i=0;i<n;i++) second[i]=sc.nextInt();
            int [] last=order(first,second,n);
            for(int i=0; i<n;i++)System.out.println(last[i]);
            System.out.println();
        }
    }
    static int[] order(int[] a, int[] b, int n){
        int[] last=new int[n];
        int max=Integer.MAX_VALUE;
        int minA=0, minAVal,minB=0,minBVal;
        for(int i=0; i<n;i++){
            minAVal=max; minBVal=max;
            for(int j=0; j<a.length; j++){
                if(a[j]<minAVal){minAVal=a[j]; minA=j;}
            }
            for(int j=0; j<b.length;j++){
                if(b[j]<minBVal){minBVal=b[j]; minB=j;}
            }
            last[minA]=minBVal;
            a[minA]=max; b[minB]=max;
        }
        return last;
    }
}
