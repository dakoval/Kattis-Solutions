/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;

import java.util.*;
import java.io.*;
public class boatparts {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int p = Integer.parseInt(line[0]),n=Integer.parseInt(line[1]),day=1;
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(br.readLine());
            if(set.size()==p) break;
            day++;
        }
        System.out.println(day==n+1?"paradox avoided":day);
    }
}
