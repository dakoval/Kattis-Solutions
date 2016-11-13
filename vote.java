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
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            int great=0;
            int place = 0;
            int total =0;
            boolean clear=true;
            for(int j=0; j<b;j++){
                int x = sc.nextInt();
                total+=x;
                if(x>great){great=x; clear=true;place =j+1;}
                else if(x==great)clear=false;
                else{}
            }
            if(!clear)System.out.println("no winner");
            else if(great*2>total)System.out.println("majority winner "+place);
            else System.out.println("minority winner "+place);
          
        }
    }
}
