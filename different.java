/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author David.Koval
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class different {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            BigInteger A = BigInteger.valueOf(Long.parseLong(sc.next()));
            BigInteger B = BigInteger.valueOf(Long.parseLong(sc.next()));
            if(A.compareTo(B)>0)System.out.println(A.subtract(B));
            else System.out.println(B.subtract(A));
        }
    }
}
