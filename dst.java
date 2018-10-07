import java.util.*;
/**
 *
 * @author DavidKoval
 */
public class dst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String s = sc.next();
            int d = sc.nextInt(),h=sc.nextInt(),m=sc.nextInt();
            int time=(h+24)*60+m;
            time += s.equals("F")?d:-d;
            System.out.println((time/60)%24+" "+time%60);
        }
    }
}
