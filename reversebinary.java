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
public class reversebinary {
    static String revbinary;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("reversebinary.in"));
        while(true){
            revbinary="";
            if(!sc.hasNext())break;
            int x = sc.nextInt();
            reverseOrder(Integer.toBinaryString(x));
           // x = Integer.parseInt(revbinary);
            System.out.println(Integer.parseInt(revbinary, 2));
        }
    }
   static void reverseOrder(String binary){
        char st[] = binary.toCharArray();
        char temp;
        for(int i = 0; i<st.length/2;i++){
            temp = st[i];st[i]=st[st.length-i-1];st[st.length-i-1]=temp;
        }
        for(int i =0; i<st.length; i++)revbinary+=st[i];
    }
}
