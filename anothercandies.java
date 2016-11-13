package Solutions;

import java.util.*;
import java.io.*;
public class anothercandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int c = sc.nextInt();
        while(c-->0){
            int n = sc.nextInt();
            long remain=0;
            for(int i=0;i<n;i++){
                remain = sc.nextLong()%n + remain%n;
            }
            if(remain%n==0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
