/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;

/**
 *
 * @author DavidKoval
 */
import java.util.*;
public class display {
    public static void main(String[] args) {
        String[][] out= { 
            {"+---+","    +","+---+","+---+","+   +","+---+","+---+","+---+","+---+","+---+"," "},
            {"|   |","    |","    |","    |","|   |","|    ","|    ","    |","|   |","|   |"," "},
            {"|   |","    |","    |","    |","|   |","|    ","|    ","    |","|   |","|   |","o"},
            {"+   +","    +","+---+","+---+","+---+","+---+","+---+","    +","+---+","+---+"," "}, 
            {"|   |","    |","|    ","    |","    |","    |","|   |","    |","|   |","    |","o"},
            {"|   |","    |","|    ","    |","    |","    |","|   |","    |","|   |","    |"," "},
            {"+---+","    +","+---+","+---+","    +","+---+","+---+","    +","+---+","+---+"," "}
        };
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            if(s.equals("end"))break;
            String[][] sol=new String[7][5];
            for(int i=0;i<5;i++){
                if(i==2){
                    for(int j=0;j<7;j++)sol[j][2]=out[j][10];
                }else{
                    int x=Integer.parseInt(s.charAt(i)+"");
                    for(int j=0;j<7;j++)sol[j][i]=out[j][x];
                }
            }
            for(int i=0;i<7;i++){
                for(int j=0;j<5;j++){
                    System.out.print(sol[i][j]);
                    if(j!=4)System.out.print("  ");
                }
                System.out.println("");
            }
            System.out.println("\n");
        }
        System.out.println("end");
    }
}
