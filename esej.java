package code.club;
import java.io.*;
public class esej {
    static int x=0,end=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]),b=(int)Math.ceil(Double.parseDouble(line[1])/2);
        end=a>b?a:b;
        permutation("", "abcdefghijklmno"); 
    }
    private static void permutation(String prefix, String str) {
        
        int n = str.length();
        if (n == 0){ System.out.print(prefix+" ");
        x++;
            if(x==end)System.exit(0);
        }else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
