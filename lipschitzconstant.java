package code.club;
import java.io.*;
import java.util.*;
public class lipschitzconstant {
    static class Point implements Comparable<Point>{
        double x,y;
        public Point(double x, double y){
            this.x=x;this.y=y;
        }
        @Override
        public int compareTo(Point o) {
            return this.x>o.x?1:-1;
        } 
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for(int i=0;i<n;i++){
            String[] line = br.readLine().split(" ");
            Point p = new Point(Double.parseDouble(line[0]),Double.parseDouble(line[1]));
            arr[i]=p;
        }
       Arrays.sort(arr);
       double max=0;
       for(int i=1;i<n;i++){
           double temp = Math.abs(arr[i-1].y-arr[i].y)/Math.abs(arr[i-1].x-arr[i].x);
           if(max<temp)max=temp;
       }
       System.out.println(max);
    }
}