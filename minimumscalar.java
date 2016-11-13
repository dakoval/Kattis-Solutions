/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author David
 */
import java.math.BigInteger;
import java.util.*;
public class minimumscalar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++){
            int length = sc.nextInt();
            int a[] = new int[length];
            int b[] = new int[length];
            for(int j=0;j<length;j++) a[j]=sc.nextInt();
            for(int j=0;j<length;j++) b[j]=sc.nextInt();
            BigInteger big = new BigInteger("0");
            Arrays.sort(a); Arrays.sort(b);
            for(int j=0;j<length;j++) big = big.add((new BigInteger(""+a[j])).multiply(new BigInteger(""+b[length-1-j])));
            System.out.println("Case #"+(i+1)+": "+big);
        }
    }
}
