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
public class whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();sc.nextLine();
        for(int i=0;i<num;i++){
            String rec = sc.nextLine();
            Set<String> sound = new HashSet<>();
            while(true){
                String line = sc.nextLine();
                if(line.equals("what does the fox say?"))break;
                Scanner l = new Scanner(line);
                l.next(); l.next(); sound.add(l.next());
            }
            String fox="";
            Scanner s = new Scanner(rec);
            while(s.hasNext()){
                String a = s.next();
                if(!sound.contains(a)) fox+= (a+" ");
            }
            System.out.println(fox);
        }
    }
}
