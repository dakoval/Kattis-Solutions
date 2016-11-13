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
public class simon {
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(new File("simon"));
        while(sc.hasNext()){
           int n=sc.nextInt();sc.nextLine();
           for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(s.length()>11&& s.substring(0,11).equals("simon says ")){
                s=s.substring(11);
            }else{s="";}
            System.out.println(s);
           }
        }
    }
}
