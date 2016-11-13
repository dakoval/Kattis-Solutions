package Solutions;

import java.io.*;
import java.util.*;
public class vivoparc {
    static boolean[][] map;
    static int[] cage;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter wr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        n = Integer.parseInt(sc.nextLine())+1;
        cage = new int[n];
        map=new boolean[n][n];
        while(sc.hasNext()){
            String[] s = sc.nextLine().split("-");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if(a==0&&b==0)break; //for testing purposes.
            map[a][b]=true;
            map[b][a]=true;
        }
        for(int i=1;i<n;i++)if(cage[i]==0)search(i);
        for(int i=1;i<n;i++)wr.printf("%d %d \n",i,cage[i]);
        wr.flush();
    }
    static boolean search(int x){ 
        int[] arr = {0,1,2,3,4};
        for(int i=1;i<n;i++)if(map[x][i])arr[cage[i]]=0;
        for(int i=1;i<5;i++){
            if(arr[i]!=0){
                cage[x]=i;
                int check=0;
                for(int j=1;j<n;j++){
                    if(map[x][j]&&cage[j]==0)if(!search(j)){check++; break;}
                }
                if(check==0)return true;
            }
        }
        cage[x]=0;
        return false;
    }
}
