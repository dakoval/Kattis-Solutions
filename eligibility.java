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
public class eligibility {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("eligibility"));
        int caseCnt = sc.nextInt();
        for(int i=0;i<caseCnt; i++){
            String name = sc.next();
            String began = sc.next();
            String born = sc.next();
            int courses = sc.nextInt();
            int year = Integer.parseInt(began.substring(2, 4));
            if(Integer.parseInt(began.substring(2,4))>=10){
                System.out.println(name+" eligible");
            }else if(Integer.parseInt(born.substring(0,4))>=1991){
                System.out.println(name+" eligible");
            }else if(courses>40){
                System.out.println(name+" ineligible");
            }else{
                System.out.println(name+" coach petitions");
            }
        }
    }
}
