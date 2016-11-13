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
import java.math.BigInteger;
import java.util.*;
public class smallestmultiple {
    static List<Integer> num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Scanner line = new Scanner(sc.nextLine());
            num = new ArrayList<>();
            while(line.hasNext()){
                int n = line.nextInt();//System.out.println(n+"--------");
                List<Integer> temp = getPrime(n);
                for(Integer x:temp){ //System.out.println(x);
                    int occTemp = Collections.frequency(temp, x);
                    int occNum = Collections.frequency(num, x);
                    if(occTemp>occNum){
                        for(int i=0;i<occTemp-occNum;i++)num.add(x);
                    }
                }
            }//System.out.println("---------");
            BigInteger tot = BigInteger.valueOf(1);
            for(int i =0;i<num.size();i++){
                tot = tot.multiply(BigInteger.valueOf(num.get(i)));
            }
           System.out.println(tot);
        }
    }
    static List getPrime(int n){
        List<Integer> x = new ArrayList<>();
        for(int i=2;i<n+1;i++){
            if(n%i==0){
                x.add(i);n=n/i;
                i--;
            }
        }
        return x;
    }
}
