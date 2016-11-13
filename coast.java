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
public class coast {
    static char map[][];
    public static class Point{
        int x;
        int y;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while(sc.hasNext()){
            int n = sc.nextInt(), m = sc.nextInt();
            map=new char[n+2][m+2];
            for(int i=0;i<n+2;i++){
                for(int j=0;j<m+2;j++){
                    map[i][j]='0';
                }
            }
            for(int i=0;i<n;i++){
                String line=sc.next();
                for(int j=0;j<m;j++){
                    map[i+1][j+1]=line.charAt(j);
                }
            }
            LinkedList<Point> q = new LinkedList<>();
            Point p = new Point(); p.x=0;p.y=0;
            q.add(p);
            map[0][0]=' ';
            int dx[] = {0,1,0,-1};
            int dy[] = {1,0,-1,0};
            int tot = 0;
            while(!q.isEmpty()){
                int x = q.getFirst().x;
                int y = q.getFirst().y;
                q.removeFirst();
                for(int d =0;d<4;d++ ){
                    int xx = x+dx[d];
                    int yy = y+dy[d];
                    if(xx>=0 && xx<n+2 && yy>=0 && yy<m+2){
                        if(map[xx][yy]=='1')tot++;
                        if(map[xx][yy]=='0'){
                            map[xx][yy]=' ';
                            p=new Point(); p.x=xx;p.y=yy;
                            q.add(p);
                        }
                    }
                }
            }
            System.out.println(tot);
        }
    }
}
