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
public class busnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        String st =""+arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]+1){
                if(n>i+1&&arr[i+1]==arr[i]+1){
                        st+="-";
                        i+=2;
                        while(n>i&&arr[i]==arr[i-1]+1)i++;
                        i--;
                        st+=arr[i];
                }else st+=" "+arr[i];
            }else st+=" "+arr[i];
        }
        System.out.println(st);
    }
}
