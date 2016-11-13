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
import java.util.*;
import java.io.*;
public class bottledup {
    public static void main(String args[]){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int s, v1, v2, t;
        s=sc.nextInt();
        v1=sc.nextInt();
        v2=sc.nextInt();
        
        t=(s/v1)*v1;
        while(t>=0 && (s-t)%v2 !=0)t-=v1;
        if(t>=0)System.out.println(t/v1 +" "+(s-t)/v2);
        else if(s%v2==0)System.out.println("0 "+s/v2);
        else System.out.println("Impossible");
    }
}
