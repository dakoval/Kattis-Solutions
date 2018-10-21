/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;

import java.io.*;
import java.util.*;
public class dunglish {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cor=new int[n],incor=new int[n],si=new int[n];
        String[] s = br.readLine().split(" "), scor=new String[n],sincor=new String[n];
        Map<String,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++)map.put(s[i], i);
        for(int i=0;i<n;i++)si[i]=map.get(s[i]);
        int m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            String[] temp = br.readLine().split(" ");
            if(map.containsKey(temp[0])){
                int x = map.get(temp[0]);
                for(int j=0;j<n;j++){
                    if(si[j]==x){
                        if(temp[2].equals("correct")){
                            cor[j]++;
                            scor[j]=temp[1];
                        }else{
                            incor[j]++;
                            sincor[j]=temp[1];
                        }
                    }
                    
                }     
            }     
            
        }
        long totPos = 1, totCor = 1; 
        for(int i=0;i<n;i++)totPos*=cor[i]+incor[i];
        for(int i=0;i<n;i++)totCor*=cor[i];
        if(totPos > 1)System.out.println(totCor+" correct\n"+(totPos-totCor)+" incorrect");
        else{
            String st="";
            boolean correct=true;
            for(int i=0;i<n;i++){
                if(scor[i]!=null)st+=scor[i]+" ";
                else{st+=sincor[i]+" ";correct=false;}
            }
            System.out.println(st+"\n"+(correct?"correct":"incorrect"));
        }
    }
}
