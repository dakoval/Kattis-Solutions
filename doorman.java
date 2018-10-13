/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;

/**
 *
 * @author DavidKoval
 */
import java.util.*;
public class doorman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dif = sc.nextInt(),m=0,w=0;
        char[] s = sc.next().toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]=='M'){
                if(Math.abs((m+1)-w)>dif){
                    if(i!=s.length-1 && s[i+1]=='W'){
                        w++;s[i+1]='M';
                    }else break;
                }else m++;
            }
            if(s[i]=='W'){
                if(Math.abs(m-(w+1))>dif){
                    if(i!=s.length-1 && s[i+1]=='M'){
                       m++;s[i+1]='W';
                    }else break;
                }else w++;
            }
        }
        System.out.println(m+w);
    }
}
