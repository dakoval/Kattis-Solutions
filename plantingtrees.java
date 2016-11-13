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
public class plantingtrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int days = 0;
        int arr[] = new int [a];
        for(int i=0;i<a;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=(a-1);i>=0;i--){
            if(((a-i)+arr[i]+1)>days)days = (a-i)+arr[i];
        }
        System.out.println(days+1);
    }
}
