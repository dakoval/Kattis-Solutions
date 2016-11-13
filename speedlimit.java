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
public class speedlimit {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("speedlimit.in"));
        while(true){
            int speeds = sc.nextInt();
            if(speeds==-1)break;
            int total=0, intime=0, curspeed=0, curtime =0;
            for(int i=0;i<speeds;i++){
                curspeed = sc.nextInt(); curtime= sc.nextInt();
                total += ((curspeed)*(curtime-intime));
                intime = curtime;
            }
            System.out.println(total+" miles");
        }
    }
}
