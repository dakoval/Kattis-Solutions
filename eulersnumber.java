
package code.club;

import java.io.*;
public class eulersnumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double x=1;
        long t=1;
        for(int i=1;i<=n;i++){
            if(i>17)break;
            t*=i;
            x+=(double)1/t;
        }
        System.out.println(x);
    }
}
