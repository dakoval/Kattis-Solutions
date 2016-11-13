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
import java.io.*;
public class kemija08 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("kemija08"));
        while(true){
            if(!sc.hasNext())break;
            char[] code = sc.nextLine().toCharArray();
            String decode="";
            for(int i=0;i<code.length;i++){
                decode+=code[i];
                if(code[i]=='a'||code[i]=='e'||code[i]=='i'||code[i]=='o'||code[i]=='u')i+=2;
            }
            System.out.println(decode);
        }
    }
}
