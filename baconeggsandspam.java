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
public class baconeggsandspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            if(n==0)break;
            List<String> items = new ArrayList<>();
            Map<String,List<String>> map = new HashMap<>(); 
            for(int i=0;i<n;i++){
                Scanner line = new Scanner(sc.nextLine());
                String name = line.next();
                while(line.hasNext()){
                    String food = line.next();
                    if(!items.contains(food))items.add(food);
                    List<String> s = map.get(food);
                    if(s==null){
                        s = new ArrayList<>();
                        s.add(name);
                        map.put(food,s);
                    }else map.get(food).add(name);
                }
            }
            Collections.sort(items);
            for(String s:items){
                List<String> l = map.get(s);
                Collections.sort(l);
                String st =s+" ";
                for(String ss:l){
                    st+=ss+" ";
                }
                System.out.println(st);
            }
            System.out.println();
        }
    }
}
