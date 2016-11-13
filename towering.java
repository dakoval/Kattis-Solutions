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
public class towering {
    static List<Integer> set = new ArrayList<>();
    static int s1;
    static int s2;
    static List<Integer> tower = new ArrayList<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++)set.add(sc.nextInt());
        s1 = sc.nextInt(); sc.nextInt();
        recur();
        int[] arr = new int[6];
        set.removeAll(tower);
        Collections.sort(set);
        Collections.sort(tower);
        System.out.println(tower.get(2)+" "+tower.get(1)+" "+tower.get(0)+" "+
                set.get(2)+" "+set.get(1)+" "+set.get(0));
    }
    static void recur(){
        if(sum()==s1&&tower.size()==3)return;
        for(int E : set){
            if(!tower.contains(E)){
                tower.add(E);
                if(sum()<s1)recur();
                if(sum()!=s1 || tower.size()!=3) tower.remove(tower.indexOf(E));
            }
        }
    }
    static int sum(){
        int sum=0;
        for(int E:tower)sum+=E;
        return sum;
    }
}
