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
public class chess {
    static int[][] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i=0;i<n;i++){
            b = new int[8][8];
            char x1=sc.next().charAt(0);
            int y1 = sc.nextInt();
            char x2=sc.next().charAt(0);
            int y2 = sc.nextInt();
            b[x1-65][8-y1]=3; b[x2-65][8-y2]=3; //System.out.println((x1-65)+" "+(8-y1)+" "+(x2-65)+" "+(8-y2));
            if(x1==x2&&y1==y2)System.out.println("0 "+x1+" "+y1);
            else if(checkD(x1-65,8-y1)||checkD(x2-65,8-y2)){System.out.println(1+" "+x1+" "+y1+" "+x2+" "+y2);}
            else if(find()){
                int nx=0,ny=0;
                for(int g=0;g<8;g++){
                    for(int h=0;h<8;h++){
                        if(b[h][g]==2){nx=g;ny=h;}
                    }
                }
                System.out.println("2 "+x1+" "+y1+" "+((char)(65+ny))+" "+(8-nx)+" "+x2+" "+y2);
            }
            else{System.out.println("Impossible");}
        }
    }
    static boolean checkD(int x1, int y1){
        int x=x1; int y=y1; 
        while(x>0&&y>0){
            b[--x][--y]++; 
            if(b[x][y]>3)return true;
        }
        x=x1; y=y1;
        while(x<7&&y>0){
            b[++x][--y]++; 
            if(b[x][y]>3)return true;
        }
        x=x1; y=y1;
        while(x>0&&y<7){
            b[--x][++y]++; 
            if(b[x][y]>3)return true;
        }
        x=x1; y=y1;
        while(x<7&&y<7){
            b[++x][++y]++; 
            if(b[x][y]>3)return true;
        }
       
        return false;
    }
    static boolean find(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(b[i][j]==2)return true;
            }
        }
        return false;
    }
    static void print(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(b[j][i]+" ");
            }System.out.println();
        }
    }
}
