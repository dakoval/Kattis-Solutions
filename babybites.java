
package code.club;

import java.io.*;
public class babybites {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), t=1;
        String[] line = br.readLine().split(" ");
        for(int i=0;i<n;i++)if(!line[i].equals("mumble") && Integer.parseInt(line[i])!=i+1) t=0;
        System.out.println(t==1?"makes sense":"something is fishy");
    }
}
