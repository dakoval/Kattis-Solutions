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
public class quickbrownfox {
    static char[] x ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(new File("quickbrownfox"));
        int num=sc.nextInt(); sc.nextLine();
        for(int i=0;i<num;i++){
            int total=0;
            boolean[] seen=new boolean[26];
            char[] let=sc.nextLine().toLowerCase().toCharArray();
            for(int j=0;j<let.length;j++){
                if(let[j]>=97&&let[j]<=122){
                    if(seen[let[j]-97]!=true)total++;
                    seen[let[j]-97]=true;
                }
            }
            
            if(total==26)System.out.println("pangram");
            else{System.out.print("missing ");
                for(int j=0;j<seen.length;j++){
                    if(seen[j]==false)System.out.print(x[j]);
                }System.out.println();
            }
        }
    }
}
