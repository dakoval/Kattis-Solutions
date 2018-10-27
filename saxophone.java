package code.club;

/**
 *
 * @author DavidKoval
 */
import java.io.*;
import java.util.*;
public class saxophone{
    public static void main(String[] args) throws Exception{
        Map<Character,int[]> map = new HashMap<>();
        int key[][]=new int[][] {{0,0,1,1,0,0,0,0,0,0,0},{0,0,1,0,0,0,0,0,0,0,0},{0,0,1,1,1,0,0,1,1,1,1},//a,b,c
                                {0,0,1,1,1,0,0,1,1,1,0},{0,0,1,1,1,0,0,1,1,0,0},{0,0,1,1,1,0,0,1,0,0,0},//d,e,f
                                {0,0,1,1,1,0,0,0,0,0,0},{0,1,1,1,0,0,0,0,0,0,0},{0,1,1,0,0,0,0,0,0,0,0},//g,A,B
                                {0,0,0,1,0,0,0,0,0,0,0},{0,1,1,1,1,0,0,1,1,1,0},{0,1,1,1,1,0,0,1,1,0,0},//C,D,E
                                {0,1,1,1,1,0,0,1,0,0,0},{0,1,1,1,1,0,0,0,0,0,0}};//F,G
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
           char[] s = br.readLine().toCharArray(); 
           int[] press = new int[11],cur = new int[11];
           for(int i=0;i<s.length;i++){
               int idx=s[i]-'a';
               if(idx<0)idx=s[i]-'A'+7;
               for(int j=1;j<11;j++){
                   if(key[idx][j]==1 && cur[j]==0){press[j]++;cur[j]=1;}
                   if(key[idx][j]==0 && cur[j]==1)cur[j]=0;
               }
           }
           for(int i=1;i<11;i++)System.out.print(press[i]+" ");
           System.out.println();
        }
        
    }
}
