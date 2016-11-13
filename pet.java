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
public class pet {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("pet"));
        while(true){
            if(!sc.hasNext())break;
            int max = 0, winner=0;
            for(int i =0; i<5; i++){
                int total=0;
                for(int j=0; j<4;j++){
                    total+=sc.nextInt();
                }
                if(total>max){
                    max=total;
                    winner=i;
                }
            }
            System.out.println((1+winner)+" "+max);
        }
    }
}
