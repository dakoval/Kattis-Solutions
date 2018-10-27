
package code.club;

import java.io.*;
import java.util.*;
public class elevatortrouble {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        String[] line = br.readLine().split(" ");
        int f = Integer.parseInt(line[0]),s = Integer.parseInt(line[1]),g = Integer.parseInt(line[2]),u = Integer.parseInt(line[3]),d = Integer.parseInt(line[4]);
        int[] visit=new int[f+1]; for(int i=1;i<=f;i++)visit[i]=-1;
        visit[s]=0;q.add(s);
        while(!q.isEmpty()){
            int x = q.poll();
            if(x==g)break;
            if(x+u<=f && visit[x+u]==-1){
                visit[x+u]=visit[x]+1;
                q.add(x+u);
            }
            if(x-d>0 && visit[x-d]==-1){
                visit[x-d]=visit[x]+1;
                q.add(x-d);
            }
        }
        System.out.println(visit[g]==-1?"use the stairs":visit[g]);
    }
}
