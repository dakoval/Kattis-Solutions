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
import java.util.Map.Entry;
public class cantinaofbabel {
    static Map<String,String> psl = new HashMap<>();
    static Map<String,Set<String>> lub = new HashMap<>();
    static Set<String> p = new HashSet<>();
    static Set<String> visited = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        psl = new HashMap<>();
        lub = new HashMap<>();
        p = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<String> lSet = new HashSet<>();
            String line = sc.nextLine();
            Scanner l = new Scanner(line);
            String name = l.next(); p.add(name);
            String spoke = l.next(); 
            psl.put(name,spoke); 
            lSet.add(name);
            if(!lub.containsKey(spoke)) lub.put(spoke, lSet);
            else lub.get(spoke).add(name);
            while(l.hasNext()){
                String x = l.next(); 
                if(!lub.containsKey(x)){
                    lSet=new HashSet<>();
                    lSet.add(name);
                    lub.put(x, lSet);
                }
                else{
                    lub.get(x).add(name);
                }
            }
        }
        Map<String,Set<String>> con = new HashMap<>();
        for(Entry e : psl.entrySet()){
            for(Entry f:psl.entrySet()){
            visited = new HashSet<>();
            boolean a = dfs((String)e.getKey(),(String)f.getKey());
            visited = new HashSet<>();
            boolean b = dfs((String)f.getKey(),(String)e.getKey());
                if(a==true&&b==true){
                    if(!con.containsKey((String)e.getKey())){
                        Set<String> temp = new HashSet<>();
                        temp.add((String)f.getKey());
                        con.put((String)e.getKey(), temp);
                    }else con.get((String)e.getKey()).add((String)f.getKey());
                    if(!con.containsKey((String)f.getKey())){
                        Set<String> temp = new HashSet<>();
                        temp.add((String)e.getKey());
                        con.put((String)f.getKey(), temp);
                    }else con.get((String)f.getKey()).add((String)e.getKey());
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(Entry e : con.entrySet()){
            int x = con.get((String)e.getKey()).size();
            if(x>max)max=x;
        }
        System.out.println(p.size()-max);
        
    
    }
    
    static boolean dfs(String start,String end){//people
        visited.add(start);
        if(start.equals(end))return true;
        if(visited.contains(end))return true;
        Set<String> peop = lub.get(psl.get(start));
        for(String p : peop){
            if(!visited.contains(p)){
                if(dfs(p,end))return true;
            }
        }
        return false;
    }
    /*
            for(Entry e : psl.entrySet()){
            visited = new HashSet<>();
            dfs((String)e.getKey());

        }
    
    }
    
    static boolean dfs(String start){//people
        visited.add(start);
        Set<String> peop = lub.get(psl.get(start));
        for(String p : peop){
            if(!visited.contains(p)){
                if(dfs(p))return true;
            }
        }
        return false;
    }
    */
}
