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
import java.io.*;
import java.util.*;
public class babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> dic = new HashMap<>();
        String a = "";
        String b = "";
        while(true){
            a = sc.next();
            b = sc.nextLine();
            if(b.equals(""))break;
            dic.put(b.substring(1),a);
        }
        if(dic.containsKey(a))System.out.println(dic.get(a));
        else System.out.println("eh");
        
        while(sc.hasNext()){
            String s= sc.next();
            if(dic.containsKey(s))System.out.println(dic.get(s));
            else System.out.println("eh");
        }
    }
}
