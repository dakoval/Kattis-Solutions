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
public class oddmanout {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("oddmanout"));
        int totalCases=sc.nextInt();
        for(int c=0; c<totalCases;c++){
            int n=sc.nextInt();
            Set<Integer> x=new HashSet<>(); int y;
            for(int i=0;i<n;i++){
                y=sc.nextInt();
                if(x.contains(y)) x.remove(y);
                else{x.add(y);}
            }
            System.out.println("Case #"+(c+1)+": "+(x.toArray())[0]);   
        }
    }
}
