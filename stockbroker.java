
package code.club;
import java.util.*;

public class stockbroker {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),cur=sc.nextInt(),next;
        long m=100;
        for(int i=1;i<d;i++){
            next=sc.nextInt();
            if(cur<next){
                int s=(int)Math.floor(m/cur);
                s= (s>100000?100000:s);
                m+=s*(next-cur);
            }
            cur=next;
        }
        System.out.println(m);
    }
}
