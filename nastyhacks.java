
package code.club;
import java.io.*;
import java.util.*;
public class nastyhacks {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]) - (Integer.parseInt(line[1])-Integer.parseInt(line[2]));
            if(x>0)System.out.println("do not advertise");
            else if(x==0)System.out.println("does not matter");
            else System.out.println("advertise");
        }
    }
}
