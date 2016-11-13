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
import java.io.*;
import java.util.*;
public class apaxiaaans {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] let=(sc.next()+" ").toCharArray();
            String word="";
            for(int i=0;i<let.length-1;i++){
                if(let[i]!=let[i+1])word+=let[i];
            }
            System.out.println(word);
        }
    }
}
