/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;
import java.io.*;
import java.util.*;
public class dejavu {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()),tot=0;
        Map<Integer,Integer> xmap = new HashMap<>();
        Map<Integer,Integer> ymap = new HashMap<>();
        int[][] p = new int[2][n];
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            p[0][i]=Integer.parseInt(s[0]);
            p[1][i]=Integer.parseInt(s[1]);
            if(!xmap.containsKey(p[0][i]))xmap.put(p[0][i], 0);
            if(!ymap.containsKey(p[1][i]))ymap.put(p[1][i], 0);
            xmap.put(p[0][i],xmap.get(p[0][i])+1);
            ymap.put(p[1][i],ymap.get(p[1][i])+1);
        }
        for(int i=0;i<n;i++){
            tot+=(xmap.get(p[0][i])-1)*(ymap.get(p[1][i])-1);
        }
        System.out.println(tot);
    }
}
