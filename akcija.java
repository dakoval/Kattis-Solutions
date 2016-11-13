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
import java.io.*;
import java.util.*;
public class akcija {
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=Integer.parseInt(sc.readLine());
        Arrays.sort(arr); 
        long total =0;
        for(int i=n-1;i>n%3;i-=3){
            total+=arr[i];
            total+=arr[i-1];
            }
        for(int i=0;i<n%3;i++)total+=arr[i];
        System.out.println(total);
    }
}
