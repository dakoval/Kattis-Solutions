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
public class acm {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        int[] attempts = new int[26];
        for(int i =0;i<26;i++)attempts[i]=0;
        int total=0;
        int correct=0;
        while(true){
            int time = sc.nextInt();
            if(time==-1)break;
            char letter = sc.next().charAt(0);
            String answer = sc.next();
            if(answer.equals("right")){
                correct++; total+=time+(attempts[letter-'A']*20);
            }else{
                attempts[letter-'A']++;
            }
        }
        System.out.println(correct+ " "+total);
    }
}
