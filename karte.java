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
public class karte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean t=true;
        char[] ch = sc.next().toCharArray();
        Set<String> P = new HashSet<>();
        Set<String> K = new HashSet<>();
        Set<String> H = new HashSet<>();
        Set<String> T = new HashSet<>();
        for(int i=0;i<ch.length;i+=3){
            String num = ch[i+1]+""+ch[i+2];
            switch(ch[i]){
                case 'P': if(P.contains(num))t=false;
                          else P.add(num);
                break;
                case 'K': if(K.contains(num))t=false;
                          else K.add(num);
                break;
                case 'H': if(H.contains(num))t=false;
                          else H.add(num);
                break;
                case 'T': if(T.contains(num))t=false;
                          else T.add(num);
                break;
            }
        }
        if(t)System.out.println((13-P.size())+" "+(13-K.size())+" "+(13-H.size())+" "+(13-T.size()));
        else System.out.println("GRESKA");
        
    }
}
