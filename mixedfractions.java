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
public class mixedfractions {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("mixedfractions"));
        while(true){
            int top = sc.nextInt();
            int bottom = sc.nextInt();
            if(bottom==0 && top==0)break;
            System.out.println(top/bottom+" "+top%bottom+" / "+ bottom);
        }
    }
}
