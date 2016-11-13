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
public class guessthedatastructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            boolean sta=true, que=true, pri=true;
            Stack xsta = new Stack();
            Queue<Integer> xque = new LinkedList<>();
            PriorityQueue<Integer> xpri = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++){
                int type =sc.nextInt();
                int num = sc.nextInt();
                if(type==2){
                    if(sta){
                        if(xsta.isEmpty() || !xsta.pop().equals(num))sta=false;
                    }
                    if(que){
                        if(xque.isEmpty() || !xque.poll().equals(num))que=false;
                    }
                    if(pri){
                        if(xpri.isEmpty() || !xpri.poll().equals(num))pri=false;
                    }
                }else{
                    xsta.push(num);
                    xque.add(num);
                    xpri.add(num);
                }
            }//System.out.println(sta+" "+que+" "+pri);
            if(sta||que||pri){
                if(sta &&!que&&!pri)System.out.println("stack");
                else if(!sta &&que&&!pri)System.out.println("queue");
                else if(!sta &&!que&&pri)System.out.println("priority queue");
                else System.out.println("not sure");
            }else System.out.println("impossible");
            
        }
    }
}
