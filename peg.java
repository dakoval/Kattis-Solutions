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
public class peg {
    static int[][] x; 
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(new File("peg"));
        while(sc.hasNext()){
            x=new int[7][7];
            for(int n=0;n<7;n++){
                String s=sc.nextLine();
                for(int i=0;i<7;i++){
                    if(s.charAt(i)=='.')x[n][i]=1;
                    else if(s.charAt(i)=='o')x[n][i]=0;
                    else x[n][i]=-1;
                }
            }
        }
    }
}
