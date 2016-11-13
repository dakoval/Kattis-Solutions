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
public class lineup {
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(new File("lineup"));
        while(sc.hasNext()){
            int num = sc.nextInt();
            int dec=0,inc=0; String pre=sc.next();
            for(int i=1;i<num;i++){
                String next=sc.next();
                int x= pre.compareTo(next);
                pre=next;
                if(x>=0)dec++;
                else inc++;
            }
            if(dec!=0&&inc==0)System.out.println("DECREASING");
            else if(dec==0&&inc!=0)System.out.println("INCREASING");
            else System.out.println("NEITHER");
        }
    }
}
