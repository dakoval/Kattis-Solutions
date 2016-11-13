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
public class cold {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("cold"));
        while(sc.hasNext()){
            int num=sc.nextInt();
            int times=0;
            for(int i=0; i<num;i++){
                int x=sc.nextInt();
                if(x<0)times++;
            }
            System.out.println(times);
        }     
    }
}
