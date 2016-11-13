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
public class quiteaproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String st = sc.nextLine().toLowerCase();
            if(st.contains("problem"))System.out.println("yes");
            else System.out.println("no");
        }
    }
}
