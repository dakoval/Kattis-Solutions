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
public class alphabetspam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char [] let = sc.nextLine().toCharArray();
        double total=let.length, ws=0,lt=0,ul=0,s=0;
        for(int i=0;i<let.length;i++){
            int x=let[i]-0;
            if(x==95)ws++;
            else if(x>=97&&x<=122) lt++;
            else if(x>=65&&x<=90) ul++;
            else s++;
        }
        System.out.println(ws/total);
        System.out.println(lt/total);
        System.out.println(ul/total);
        System.out.println(s/total);
    }
}
