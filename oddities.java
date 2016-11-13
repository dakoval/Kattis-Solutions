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
public class oddities {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("oddities.in"));
        int count = sc.nextInt();
        for(int i = 0; i<count; i++){
            int n = sc.nextInt();
            int x =n%2;
            if(x==0){
                System.out.println(n+ " is even");
            }else{
                System.out.println(n+ " is odd");
            }
        }
    }
}
