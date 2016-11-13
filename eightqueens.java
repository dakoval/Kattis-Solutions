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
public class eightqueens {
    static int [][] board;
    public static void main(String[] args) {
        board = new int [8][8];
        int tot =0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<8;i++){
            char[] let = sc.next().toCharArray();
            for(int j=0;j<8;j++){ 
              if(let[j]=='*'){board[i][j]=1; tot++;}
              else board[i][j]=0;
            }
        }
        if(tot==8){
            if(UpDown()&&RightLeft()&&D1()&&D2()&&D3()&&D4())System.out.println("valid");
            else System.out.println("invalid");
        }else System.out.println("invalid");
    }
    static boolean UpDown(){
        for(int i=0;i<8;i++){
            int sum =0;
            for(int j=0;j<8;j++)sum+=board[j][i];
            if(sum>1)return false;
        }
        return true;
    }    
    static boolean RightLeft(){
        for(int i=0;i<8;i++){
            int sum =0;
            for(int j=0;j<8;j++)sum+=board[i][j]; 
            if(sum>1)return false;
        }
        return true;
    }

    static boolean D1(){
        for(int i=0;i<8;i++){
            int sum=0;
            int x=i;
            for(int j=0;j<=i;j++){
                sum+=board[x][i-x];
                x-=1;
            }
            if(sum>1)return false;
        }
        return true;
    }
    static boolean D2(){
        for(int i=7;i>-1;i--){
            int sum=0;
            int x=0;
            for(int j=i;j<8;j++){
                sum+=board[j][x++]; 
            }
            if(sum>1)return false;
        }
        return true;
    }
    static boolean D3(){
        for(int i=0;i<7;i++){
            int sum=0;
            int x=i;
            for(int j=7;x>-1;j--){
                sum+=board[x--][j];
            }
            if(sum>1)return false;
        }
        return true;
    }
    static boolean D4(){
        for(int i=7;i>-1;i--){
            int sum=0;
            int x=i;
            for(int j=7;j>=i;j--){
                sum+=board[x++][j];
            }
            if(sum>1)return false;
        }
        return true;
    }
}
