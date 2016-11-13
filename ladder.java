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
import java.math.*;
public class ladder {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("ladder"));
        while(sc.hasNext()){
            int h = sc.nextInt();
            int d = sc.nextInt(); 
            System.out.println((int)Math.ceil(h/Math.sin((Math.toRadians(d)))));
        }
    }
}
