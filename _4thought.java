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
public class _4thought {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(4+4+4/4==x)System.out.println("4 + 4 + 4 / 4 = "+x);
            else if(4+4+4*4==x)System.out.println("4 + 4 + 4 * 4 = "+x);
            else if(4+4+4+4==x)System.out.println("4 + 4 + 4 + 4 = "+x);
            else if(4+4+4-4==x)System.out.println("4 + 4 + 4 - 4 = "+x);
            else if(4+4-4/4==x)System.out.println("4 + 4 - 4 / 4 = "+x);
            else if(4+4-4*4==x)System.out.println("4 + 4 - 4 * 4 = "+x);
            else if(4+4-4+4==x)System.out.println("4 + 4 - 4 + 4 = "+x);
            else if(4+4-4-4==x)System.out.println("4 + 4 - 4 - 4 = "+x);
            else if(4+4*4/4==x)System.out.println("4 + 4 * 4 / 4 = "+x);
            else if(4+4*4*4==x)System.out.println("4 + 4 * 4 * 4 = "+x);
            else if(4+4*4+4==x)System.out.println("4 + 4 * 4 + 4 = "+x);
            else if(4+4*4-4==x)System.out.println("4 + 4 * 4 - 4 = "+x);
            else if(4+4/4/4==x)System.out.println("4 + 4 / 4 / 4 = "+x);
            else if(4+4/4*4==x)System.out.println("4 + 4 / 4 * 4 = "+x);
            else if(4+4/4+4==x)System.out.println("4 + 4 / 4 + 4 = "+x);
            else if(4+4/4-4==x)System.out.println("4 + 4 / 4 - 4 = "+x);
            
            else if(4-4+4/4==x)System.out.println("4 - 4 + 4 / 4 = "+x);
            else if(4-4+4*4==x)System.out.println("4 - 4 + 4 * 4 = "+x);
            else if(4-4+4+4==x)System.out.println("4 - 4 + 4 + 4 = "+x);
            else if(4-4+4-4==x)System.out.println("4 - 4 + 4 - 4 = "+x);
            else if(4-4-4/4==x)System.out.println("4 - 4 - 4 / 4 = "+x);
            else if(4-4-4*4==x)System.out.println("4 - 4 - 4 * 4 = "+x);
            else if(4-4-4+4==x)System.out.println("4 - 4 - 4 + 4 = "+x);
            else if(4-4-4-4==x)System.out.println("4 - 4 - 4 - 4 = "+x);
            else if(4-4*4/4==x)System.out.println("4 - 4 * 4 / 4 = "+x);
            else if(4-4*4*4==x)System.out.println("4 - 4 * 4 * 4 = "+x);
            else if(4-4*4+4==x)System.out.println("4 - 4 * 4 + 4 = "+x);
            else if(4-4*4-4==x)System.out.println("4 - 4 * 4 - 4 = "+x);
            else if(4-4/4/4==x)System.out.println("4 - 4 / 4 / 4 = "+x);
            else if(4-4/4*4==x)System.out.println("4 - 4 / 4 * 4 = "+x);
            else if(4-4/4+4==x)System.out.println("4 - 4 / 4 + 4 = "+x);
            else if(4-4/4-4==x)System.out.println("4 - 4 / 4 - 4 = "+x);
            
            else if(4*4+4/4==x)System.out.println("4 * 4 + 4 / 4 = "+x);
            else if(4*4+4*4==x)System.out.println("4 * 4 + 4 * 4 = "+x);
            else if(4*4+4+4==x)System.out.println("4 * 4 + 4 + 4 = "+x);
            else if(4*4+4-4==x)System.out.println("4 * 4 + 4 - 4 = "+x);
            else if(4*4-4/4==x)System.out.println("4 * 4 - 4 / 4 = "+x);
            else if(4*4-4*4==x)System.out.println("4 * 4 - 4 * 4 = "+x);
            else if(4*4-4+4==x)System.out.println("4 * 4 - 4 + 4 = "+x);
            else if(4*4-4-4==x)System.out.println("4 * 4 - 4 - 4 = "+x);
            else if(4*4*4/4==x)System.out.println("4 * 4 * 4 / 4 = "+x);
            else if(4*4*4*4==x)System.out.println("4 * 4 * 4 * 4 = "+x);
            else if(4*4*4+4==x)System.out.println("4 * 4 * 4 + 4 = "+x);
            else if(4*4*4-4==x)System.out.println("4 * 4 * 4 - 4 = "+x);
            else if(4*4/4/4==x)System.out.println("4 * 4 / 4 / 4 = "+x);
            else if(4*4/4*4==x)System.out.println("4 * 4 / 4 * 4 = "+x);
            else if(4*4/4+4==x)System.out.println("4 * 4 / 4 + 4 = "+x);
            else if(4*4/4-4==x)System.out.println("4 * 4 / 4 - 4 = "+x);
            
            else if(4/4+4/4==x)System.out.println("4 / 4 + 4 / 4 = "+x);
            else if(4/4+4*4==x)System.out.println("4 / 4 + 4 * 4 = "+x);
            else if(4/4+4+4==x)System.out.println("4 / 4 + 4 + 4 = "+x);
            else if(4/4+4-4==x)System.out.println("4 / 4 + 4 - 4 = "+x);
            else if(4/4-4/4==x)System.out.println("4 / 4 - 4 / 4 = "+x);
            else if(4/4-4*4==x)System.out.println("4 / 4 - 4 * 4 = "+x);
            else if(4/4-4+4==x)System.out.println("4 / 4 - 4 + 4 = "+x);
            else if(4/4-4-4==x)System.out.println("4 / 4 - 4 - 4 = "+x);
            else if(4/4*4/4==x)System.out.println("4 / 4 * 4 / 4 = "+x);
            else if(4/4*4*4==x)System.out.println("4 / 4 * 4 * 4 = "+x);
            else if(4/4*4+4==x)System.out.println("4 / 4 * 4 + 4 = "+x);
            else if(4/4*4-4==x)System.out.println("4 / 4 * 4 - 4 = "+x);
            else if(4/4/4/4==x)System.out.println("4 / 4 / 4 / 4 = "+x);
            else if(4/4/4*4==x)System.out.println("4 / 4 / 4 * 4 = "+x);
            else if(4/4/4+4==x)System.out.println("4 / 4 / 4 + 4 = "+x);
            else if(4/4/4-4==x)System.out.println("4 / 4 / 4 - 4 = "+x);
            
            else System.out.println("no solution");
            
        }
    
    }
}
