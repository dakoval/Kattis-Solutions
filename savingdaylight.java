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
public class savingdaylight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] day = sc.nextLine().split(" ");
            String[] start = day[3].split(":");
            String[] end = day[4].split(":");
            int h = Integer.parseInt(end[0])-Integer.parseInt(start[0]);
            int m = Integer.parseInt(end[1])-Integer.parseInt(start[1]);
            if(m<0){h--;m +=60;}
            System.out.println(day[0]+" "+day[1]+" "+day[2]+" "+h+" hours "+m+" minutes");
        }
    }
}
