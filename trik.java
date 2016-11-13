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
public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int p=1;
        for(int i=0;i<s.length;i++){
            if(s[i]=='A'){
                if(p==1)p=2;
                else if(p==2)p=1;
                else p=3;
            }else if(s[i]=='B'){
                if(p==1)p=1;
                else if(p==2)p=3;
                else p=2;
            }else{
                if(p==1)p=3;
                else if(p==2)p=2;
                else p=1;
            }
        }
        System.out.println(p);
    }
}
