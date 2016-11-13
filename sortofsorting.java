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
public class sortofsorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            if(n==0)break;
            String []arr = new String[n];
            for(int i=0; i<n;i++)arr[i]=sc.nextLine();
            for(int i=0;i<n;i++){
                String s ="zzz"; int x =0;
                for(int j=0;j<n;j++){
                    if(arr[j].charAt(0)<s.charAt(0)){s=arr[j]; x=j;}
                    else if(arr[j].charAt(0)==s.charAt(0)){
                        if(arr[j].charAt(1)<s.charAt(1)){s=arr[j]; x=j;}
                    } 
                }
                System.out.println(s);
                arr[x]="zzz";
            }
            System.out.println();
        }
    }
}
