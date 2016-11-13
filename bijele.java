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
public class bijele {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] need = {1,1,2,2,2,8};
        int[] have = new int[6];
        for(int i=0;i<6;i++)have[i]= sc.nextInt();
        String s =""+(need[0]-have[0]);
        for(int i=1;i<6;i++)s=s+" "+(need[i]-have[i]);
        System.out.println(s);
    }
}
