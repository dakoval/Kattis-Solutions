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
public class piglatin {
    public static void main(String args[])throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while(null!=(line=sc.readLine())){
            String []words = line.split(" ");
            for(int i=0;i<words.length;i++){
                String word = words[i];
                int start=0;
                for(int j=0;j<word.length();j++){
                    char let=word.charAt(j);
                    start=j;
                    if(let=='a'||let=='e'||let=='i'||let=='o'||let=='u'||let=='y')break;
                }
                if(start==0){
                    System.out.print(word+"yay ");
                }else{
                    System.out.print(word.subSequence(start, word.length()) +""+ word.subSequence(0, start)+""+"ay "); 
                }
            } System.out.println();
        }sc.close();
    }
}
