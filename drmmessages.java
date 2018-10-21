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
import java.io.*;
public class drmmessages {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] s1=s.substring(0, s.length()/2).toCharArray(),s2=s.substring(s.length()/2,s.length()).toCharArray();//Divide
        s1=rotate(s1);s2=rotate(s2); //Rotate
        System.out.println(merge(s1,s2));//merge
    }

    static char[] rotate(char[] s) {
        int rotation = 0;
        for(int i=0;i<s.length;i++)rotation+=s[i]-'A';
        for(int i=0;i<s.length;i++) s[i]=(char)('A'+(s[i]-'A'+rotation)%26);
        return s;
    }

    static String merge(char[] s1, char[] s2) {
        String s ="";
        for(int i=0;i<s1.length;i++)s+=(char)('A'+(s1[i]+s2[i])%26);
        return s;
    }
}
