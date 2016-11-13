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
public class t9spelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] let = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999","0"};
        for(int i=0; i<n; i++){
            String s = "";
            char[] l = sc.nextLine().toCharArray();
            for(int j=0;j<l.length;j++){
                int x = l[j]-97;
                if(x<0||x>26){
                    if(j>0&&s.charAt(s.length()-1)=='0')s+=" "+let[26];
                    else s+=""+let[26];
                }else{
                    if(j>0&&s.charAt(s.length()-1)==let[x].charAt(0))s+=" "+let[x];
                    else s+=""+let[x];
                }
            }
            System.out.println("Case #"+(i+1)+": "+s);
        }
    }
}
