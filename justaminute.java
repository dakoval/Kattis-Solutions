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
public class justaminute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=0;
        int s=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            m+=sc.nextInt();
            s+=sc.nextInt();
        }
        if(m*60>=s)System.out.println("measurement error");
        else System.out.println((double)s/(m*60));
    }
}
