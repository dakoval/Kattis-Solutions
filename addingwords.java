/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.io.*;
import java.util.*;

/**
 *
 * @author David.Koval
 */
public class addingwords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter wr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        Map<String, Integer> def = new HashMap<>();
        Map<Integer, String> ans = new HashMap<>();
        while(sc.hasNext()){
            String command = sc.next();
            if(command.equals("def")){
                String s = sc.next();
                int i = sc.nextInt();
                ans.remove(def.get(s));
                def.put(s, i);
                ans.put(i, s);
            }else if(command.equals("calc")){
                String eq; int total=0; boolean t=true; String s= sc.next();
                eq=s;
                if(def.containsKey(s)) total=def.get(s);
                else t=false;
                while(true){
                    String sign = sc.next();
                    eq +=" "+sign;
                    if(sign.equals("="))break;
                    s = sc.next();
                    eq +=" "+s;
                    if(!def.containsKey(s))t=false;
                    if(sign.equals("+")){
                        if(def.containsKey(s)) total+=def.get(s);
                        else t=false;
                    }
                    else 
                        if(def.containsKey(s))total-=def.get(s);
                        else t=false;
                }
                if(ans.containsKey(total)&& t) wr.println(eq+" "+ans.get(total));
                else wr.println(eq+" unknown");
                wr.flush();
            }else{
                def.clear();
                ans.clear();
            }
        }
    }
}
