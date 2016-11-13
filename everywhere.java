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
public class everywhere {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("everywhere"));
        int caseCnt = sc.nextInt();
        for(int i=0; i<caseCnt; i++){
            int cities = sc.nextInt();
            Set<String> places= new HashSet<String>();
                for(int j=0; j<cities; j++){
                    places.add(sc.next());
                }
                System.out.println(places.size());
            
        }
    }
}
