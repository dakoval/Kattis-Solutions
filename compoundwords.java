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
public class compoundwords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<String> words = new HashSet<>();
        List<String> newWords = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals("s"))break;
            words.add(s);
        } int x=0;
        for(String s : words){
            for(String st :words){
                if(!s.equals(st)) if(!newWords.contains(s+st))newWords.add(s+st);
            }
        }
        Collections.sort(newWords);
        for(String s:newWords)System.out.println(s);
    }
}
