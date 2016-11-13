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
public class parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={0,sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int t[] = new int[101];
        for(int j=0;j<3;j++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int i=x; i<y;i++) t[i]++;
        }
        int total =0;
        for(int i=0;i<100;i++){total+=a[t[i]]*t[i];}
        System.out.println(total);
    }
}
