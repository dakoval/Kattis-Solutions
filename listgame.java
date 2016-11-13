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
public class listgame {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
             int y = sc.nextInt();
             int x=y;
             int count=0;
             int div=2;
             while(y>=((div)*(div))&&x>1){
                 while(x%div==0){
                     x=x/div;
                     count++;
                 }
                 div++;
             }
             if(x>1)count++;
             System.out.println(count);
        }
    }
}
