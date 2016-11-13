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
import java.util.Map.Entry;
public class incognito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        for(int i=0;i<n1;i++){
            Map<String,Set<String>> map = new HashMap<>();
            Set<String> access =new HashSet<>();
            int n2 =sc.nextInt();
            for(int j=0;j<n2;j++){
                String acc = sc.next();
                String type = sc.next();
                if(!map.containsKey(type)){
                    Set<String> s = new HashSet<>();
                    s.add(acc);
                    map.put(type, s);
                    access.add(type);
                }else{
                   Set<String> s = map.get(type);
                   s.add(acc);
                   map.put(type, s);
                }
            }
            int total =1;
            for(String x:access){
               total= (total*(map.get(x).size()+1));
            }
            System.out.println(total-1);
        }
    }     
}
