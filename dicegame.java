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
public class dicegame {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("dicegame"));
        while(sc.hasNext()){
            int Gunnar =0;
            int Emma=0;
            for(int i=0;i<4;i++)Gunnar+=sc.nextInt();
            for(int i=0;i<4;i++)Emma+=sc.nextInt();
            if(Gunnar>Emma)System.out.println("Gunnar");
            else if(Gunnar<Emma)System.out.println("Emma");
            else System.out.println("Tie");
        }
    }
}
