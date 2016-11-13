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
public class spavanac {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("spavanac.in"));
        while(true){
            if(!sc.hasNext())break;
            int hour = sc.nextInt();
            int min = sc.nextInt();
            if(min<45){
                if(hour<1){
                    System.out.println(23+" "+(min+15));
                }else{
                    System.out.println((hour-1)+" "+(min+15));
                }
            }else{
                System.out.println(hour+" "+(min-45));
            }
        }
    }
}
