
package Solutions;

import java.io.*;
import java.util.*;

public class conundrum {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("conundrum.in"));
        while(true){
            String word = sc.nextLine();
            int place =0;
            int changes =0;
            if(word.equals(""))break;
            for(int i = 0; i<word.length(); i++){
                char letter = word.charAt(i);
                switch(place){
                    case 0:if(letter!='P'){changes++;}
                    break;
                    case 1:if(letter!='E'){changes++;}
                    break;
                    case 2:if(letter!='R'){changes++;}
                    break;
                }
                place = (++place)%3;
            }
            System.out.println(changes);
        }
        
    }
}
