
package Solutions;

/**
 *
 * @author David
 */
import java.io.*;
import java.util.*;
public class pivot {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(new File("pivot"));
        while(sc.hasNextInt()){
            int n =sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int before[]=new int[n];
            int output=0;
            for(int i=0,max=Integer.MIN_VALUE;i<n;i++){
                before[i]=max;
                if(max<a[i])max=a[i];
            }
            for(int i=n-1,min=Integer.MAX_VALUE;i>=0;i--){
                if(a[i]>before[i]&&a[i]<min)output++;
                if(a[i]<min)min=a[i];
            }
            System.out.println(output);
        }
    }
}
