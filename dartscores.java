package Solutions;

import java.util.*;
import java.io.*;
public class dartscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int c = sc.nextInt();
        while(c-->0){
            int t = sc.nextInt();
            int tot=0;
            while(t-->0){
                int x = Math.abs(sc.nextInt());
                int y = Math.abs(sc.nextInt());
                double d = (double)Math.sqrt((x*x)+(y*y))/20;
                if(d<11){
                    tot+=(11-Math.ceil(d+.0000000000000001));
                }
            }
            System.out.println(tot);
        }
    }
}
