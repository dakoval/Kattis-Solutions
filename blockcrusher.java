
package Solutions;
import java.io.*;
import java.util.*;

public class blockcrusher {
    static Point[][] visited;
    static int[][] area;
    static int depth;
    static Point last;
    static class Point{
        public int x,y,w;
        public Point parent;
        public Point[] pts={null,null,null,null,null,null,null,null};
        public Point(int a, int b, int c){
            x=a;
            y=b;
            w=c;
            parent=null;
        }
        
    }
    static void dijkstra(){
        PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>(){
            public int compare(Point a, Point b){
                return a.w-b.w;
            }
        });
        for(int i=0;i<area.length;i++){
            Point p=new Point(-1,-1,0);
            visited[i][0].parent=p;
            pq.add(visited[i][0]);
        }
        int min = Integer.MAX_VALUE; 
        while(!pq.isEmpty()){
            Point p = pq.poll();
            if(p.y==depth-1 && min>p.w){min=p.w;last=p;}
            if(p.w<min){
                for(int i=0;i<8;i++){
                    Point a = p.pts[i];
                    if(a!=null){
                        if(visited[a.x][a.y].parent!=null){
                            if(visited[a.x][a.y].w>a.w+p.w){
                                a.parent=p;
                                a.w+=p.w;
                                visited[a.x][a.y]=a;
                                pq.add(a);
                            }
                        }else{
                            a.parent=p;
                            a.w+=p.w;
                            visited[a.x][a.y]=a;
                            pq.add(a);
                        }
                    }
                } 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter wr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            sc.nextLine();
            if(h==0 &&w ==0)break;
            area = new int[w][h];
            visited = new Point[w][h];
            depth=h;
            Point p;
            for(int i=0;i<h;i++){
                String each = sc.nextLine();
                for(int j=0;j<w;j++){
                    p=new Point(j,i,Integer.parseInt(each.substring(j, j+1)));
                    visited[j][i]=p;
                    area[j][i]=p.w;
                }
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    p=visited[j][i];
                    if(i>0)p.pts[0]=visited[j][i-1];
                    if(i>0 && j<w-1)p.pts[1]=visited[j+1][i-1];
                    if(j<w-1)p.pts[2]=visited[j+1][i];
                    if(i<h-1 && j<w-1)p.pts[3]=visited[j+1][i+1];
                    if(i<h-1)p.pts[4]=visited[j][i+1];
                    if(i<h-1 && j>0)p.pts[5]=visited[j-1][i+1];
                    if(j>0)p.pts[6]=visited[j-1][i];
                    if(i>0 && j>0)p.pts[7]=visited[j-1][i-1];
                    
                }
            }
            dijkstra();
            while(true){
                if(last.x==-1 & last.y==-1)break;
                area[last.x][last.y]=0;
                last=last.parent;
            }
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(area[j][i]==0)System.out.print(" ");
                    else System.out.print(area[j][i]);
                }
                System.out.println();
            }
        }
    }
}
