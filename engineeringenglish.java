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
public class engineeringenglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        while(sc.hasNext()){
            Scanner w = new Scanner(sc.nextLine());
            String line="";
            while(w.hasNext()){
                String word = w.next();
                if(words.contains(word.toLowerCase())){
                    line+=". ";
                }else{
                    words.add(word.toLowerCase());
                    line+=word+" ";
                }
            }
            System.out.println(line);
        }
    }
}
