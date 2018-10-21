/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code.club;

import java.io.*;
import java.util.*;
public class dungeon {
    static int[][][] map;
    static int[] dirR = {-1,0,1,0},dirC={0,1,0,-1};//0=forward, 1=right, 2=down, 3=left, 4=up, 5=down
    static int[] start,end;
    static P NULL = new P(-1,-1,-1,-1);
    static Queue<P> q;
    static int l,r,c, max=30*30*30;
    public static class P{
        int l,r,c,time;
        public P(int l,int r, int c, int time) {
            this.l=l;this.r=r;this.c=c;this.time=time;
        }
    }
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            q=new LinkedList<>();
            String[] line=br.readLine().split(" ");
            l = Integer.parseInt(line[0]);r = Integer.parseInt(line[1]);c = Integer.parseInt(line[2]);
            if(l==0 && r==0 && c==0)break;
            map=new int[l][r][c];
            for(int i=0;i<l;i++){
                for(int j=0;j<r;j++){
                     char[] line1=br.readLine().toCharArray();
                     for(int k=0;k<c;k++){ 
                         if(line1[k]=='S'){start= new int[] {i,j,k};map[i][j][k]=0;}
                         else if(line1[k]=='E'){end= new int[] {i,j,k};map[i][j][k]=max;}
                         else if(line1[k]=='#')map[i][j][k]=-1;
                         else map[i][j][k]=max;
                     }
                }
                br.readLine();
            }
            boolean reachable=false;
            q.add(new P(start[0],start[1],start[2],0));
            while(!q.isEmpty()){
                P p = q.poll();
                if(p.l==end[0] && p.r==end[1] && p.c==end[2]){
                    System.out.println("Escaped in "+p.time+" minute(s).");
                    reachable=true;
                    break;
                }
                add(bounds(p.l-1,p.r,p.c,p.time+1));
                add(bounds(p.l+1,p.r,p.c,p.time+1));
                for(int i=0;i<4;i++){
                    add(bounds(p.l,p.r+dirR[i],p.c+dirC[i],p.time+1));
                }
            }
            if(!reachable)System.out.println("Trapped!");
        }
    }
    
    static P bounds(int l1, int r1, int c1,int t){
        if(l1<0||r1<0||c1<0||l1>=l||r1>=r||c1>=c)return NULL;
        if(map[l1][r1][c1]==-1)return NULL;
        if(!optimal(l1,r1,c1,t))return NULL;
        return new P(l1,r1,c1,t);
    }
    static boolean optimal(int l1, int r1, int c1,int t){
        if(map[l1][r1][c1]<t)return false;
        return true;
    }
    static void add(P p){
        if(p!=NULL){
            q.add(p);
            map[p.l][p.r][p.c]=-1;
        }
    }
}