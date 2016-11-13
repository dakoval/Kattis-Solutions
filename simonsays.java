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
public class simonsays {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("simonsays"));
        while(sc.hasNext()){
            String check="Simon says";
            int n=sc.nextInt();
            String s = sc.nextLine();
            for(int i=0; i<n; i++){
                s=sc.nextLine();
                if(s.length()>10){
                    if(check.equals(s.subSequence(0, 10))){
                        System.out.println(s.substring(10,s.length()));
                    }
                }
            }
        }
    }
}
