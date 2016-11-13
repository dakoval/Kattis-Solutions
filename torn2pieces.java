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
public class torn2pieces {
    static Map<String, Set<String>> map;
    static Set<String> visited;
    static List<String> path;
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); sc.nextLine();
            map = new HashMap<>(); visited= new HashSet<>(); path=new LinkedList<>();
            for(int i=0; i<n;i++){
                Scanner line = new Scanner(sc.nextLine());
                String place = line.next();
                while(line.hasNext()){
                    String goTo = line.next();
                    Set<String> from = map.get(place);
                    if(from==null){
                        from = new HashSet<>();
                        map.put(place, from);
                    }
                    from.add(goTo);
                    Set<String> to = map.get(goTo);
                    if(to==null){
                        to=new HashSet<>();
                        map.put(goTo, to);
                    }
                    to.add(place);
                }
            }
            String start = sc.next();
            String goal = sc.next();
            path.add(start);
            if(dfs(start, goal)){
                String s ="";
                for(String node : path){
                    System.out.print(node + " ");
                }
            }else{
                System.out.println("no route found");
            }
        }
    }
    static boolean dfs(String start,String goal){
        if(!visited.add(start))return false;
        if(start.equals(goal)) return true;
        Set<String> con = map.get(start);
        if(con==null)return false;
        for(String to:con){
            path.add(to);
            if(dfs(to,goal))return true;
            path.remove(path.size()-1);
        }
        return false;
    }
}