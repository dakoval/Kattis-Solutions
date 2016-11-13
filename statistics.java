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
public class statistics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int caseCnt = 0;
        while(sc.hasNext()){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int n = sc.nextInt();
            for(int i=0;i<n;i++){ 
                int x = sc.nextInt();
                if(min>x)min=x;
                if(max<x)max=x;
            }
            System.out.println("Case "+ ++caseCnt+": "+min+" "+max+" "+(max-min));
        }
    }
}
