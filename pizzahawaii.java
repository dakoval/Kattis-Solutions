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
public class pizzahawaii {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(new File("pizzahawaii"));
        int caseCnt=sc.nextInt();
        for(int x=0;x<caseCnt;x++){
            ArrayList<String> frn=new ArrayList<>();
            ArrayList<String> nat =new ArrayList<>();
            HashMap<String,String> mapfrn=new HashMap<>();
            HashMap<String,String> mapnat=new HashMap<>();
            int pizzas=sc.nextInt();
            for(int y=0;y<pizzas;y++){
                String pizza=sc.next();
                int top=sc.nextInt();
                for(int z=0;z<top;z++){
                    String ing=sc.next();
                    if(!frn.contains(ing))frn.add(ing);
                    String ret=mapfrn.get(ing); 
                    if(ret==null)ret="";
                    mapfrn.put(ing, ret+pizza);
                }
                top=sc.nextInt();
                for(int z=0;z<top;z++){
                    String ing=sc.next();
                    if(!nat.contains(ing))nat.add(ing);
                    String ret=mapnat.get(ing);
                    if(ret==null)ret="";
                    mapnat.put(ing, ret+pizza);
                }
            }
            Collections.sort(nat);
            Collections.sort(frn);
                for(int a=0;a<frn.size();a++){
                    for(int b=0; b<nat.size();b++){
                       if(mapfrn.get(frn.get(a)).equals(mapnat.get(nat.get(b))))System.out.println("("+(frn.get(a))+", "+(nat.get(b))+")");
                    }
                }
            System.out.println();
        }
    }
}
