
import java.io.*;
import java.util.*;
/**
 *
 * @author DavidKoval
 */
public class daceydice {
    static int valid,n,endRow,endCol;
    static char[][] mat;
    static Map<Integer,Set> visited;
    static int[] row = {-1,0,1,0},col={0,1,0,-1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            n = Integer.parseInt(br.readLine());
            valid=0;
            int five=4,curRow=0,curCol=0;
            mat = new char[n][n];
            visited=new HashMap<>();
            for(int i=0;i<n;i++)mat[i]=br.readLine().toCharArray();
            for(int i=0;i<n;i++)for(int j=0;j<n;j++){
                visited.put(i*100+j, new HashSet<>());
                if(mat[i][j]=='S'){
                    curRow=i;curCol=j;
                }
                if(mat[i][j]=='H'){
                    endRow=i;endCol=j;
                }
            }
            dfs(curRow,curCol,five);
            String s = valid==1 ? "Yes":"No";
            System.out.println(s);
        }  
    }
    static void dfs(int curRow, int curCol, int five) {
        //print(five);
        if(valid==1)return;
        if(((mat[curRow][curCol]=='H')|| (curRow==endRow && curCol==endCol)) && five==6){
            valid=1;
        }
        if(visited.get(curRow*100+curCol).add(five)){
            mat[curRow][curCol]='-';
            for(int i=0;i<4;i++){
                if(limits(curRow,curCol,i)){
                    dfs(curRow+row[i],curCol+col[i],locateFive(five,i));
                }
            }
            mat[curRow][curCol]='.';
        }
        
    }
    
    static int locateFive(int five, int dir){
        int[][] dice = {{},{6,1,5,1},{2,6,2,5},{5,3,6,3},{4,5,4,6},{1,2,3,4},{3,4,1,2}};
        return dice[five][dir];
    }
    static boolean limits(int curRow, int curCol, int dir){
        if(curRow+row[dir]>=n || curRow+row[dir]<0 || curCol+col[dir]>=n || curCol+col[dir]<0)return false;
        if(mat[curRow+row[dir]][curCol+col[dir]]=='*')return false;
        return true;
    }
    
    static void print(int five){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println(five+" : location");
        System.out.println();
    }
}
