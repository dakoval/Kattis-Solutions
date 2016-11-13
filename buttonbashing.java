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
public class buttonbashing {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        int cases = sc.nextInt();
        for(int i=0;i<cases;i++){
            int n, t;
            n=sc.nextInt();
            t=sc.nextInt();
            int buttons[] = new int[t];
            for(int j=0;j<n;j++)buttons[j]=sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            int able[]= new int[3601];
            for(int j=0;j<3601;j++)able[j]=Integer.MAX_VALUE;
            able[0]=0;
            q.add(0);
            while(!q.isEmpty()){
                int x = q.remove();
                int ablex = able[x];
                for(int j=0;j<n;j++){
                    int xx = x+buttons[j];
                    xx = Math.max(0, Math.min(3600,xx));
                    if(able[xx]>(ablex+1)){
                    able[xx]=ablex+1;
                        q.add(xx);
                    }
                }
            }
            for(int j=t;j<=3600;j++){
                if(able[j]!=Integer.MAX_VALUE){
                    System.out.println(able[j]+" "+ (j-t));
                    break;
                }
            }
        }
    }
}
