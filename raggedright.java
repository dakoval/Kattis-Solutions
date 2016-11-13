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
import java.io.*;
import java.util.*;
public class raggedright {
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(new File("raggedright"));
        int max=0; ArrayList x=new ArrayList();
        while(sc.hasNext()){
            String s= sc.nextLine();
            if(s.length()>max)max=s.length();
            x.add(s.length());
        }
        int total=0;
        for(int i=0; i<x.size()-1;i++){
            total+=((max-(int)x.get(i))*(max-(int)x.get(i)));
        }
        System.out.println(total);
    }
}
