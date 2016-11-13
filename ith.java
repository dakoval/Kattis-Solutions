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
public class ith {
    
    static Set<Integer>[] board;
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("ith"));
        while(true){
            int col = sc.nextInt(); int row = sc.nextInt(); int queens = sc.nextInt();
            if(col==0 &&row==0&& queens==0)break;
            board = new Set[col];
            for(int i=0;i<col;i++){
                board[i] = new HashSet<Integer>();
            }
            for(int i = 0; i<queens; i++){
                int c = sc.nextInt(); int r = sc.nextInt();
                setQueens(c-1,r-1,col,row);
            }
            System.out.println((col*row)-total());
        }
    }
    static void setQueens(int c, int r, int column, int rows){
       for(int i=0; i<rows;i++)board[c].add(i); //verical
       for(int i=0; i<board.length;i++)board[i].add(r); //horizontal
       int col=c, row=r;
       while(col>=0 && row>=0)board[col--].add(row--);//left top diagonal
       col=c;row=r;
       while(board.length>col&& rows>row)board[col++].add(row++);//right bottom diagonal
       col=c;row=r;
       while(board.length>col&&row>=0)board[col++].add(row--); //right top diagonal
       col=c;row=r;
       while(col>=0&&rows>row)board[col--].add(row++);
    }
    static int total(){
        int total=0;
        for(int i=0; i<board.length;i++){
            total+=board[i].size();
        }
        return total;
    }
}
