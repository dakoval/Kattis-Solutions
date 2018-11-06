import java.io.*;
public class rationalratio {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" "),num= line[0].split("\\.");
        String rp = num[1].substring(num[1].length()-Integer.parseInt(line[1])),nrp=num[1].substring(0, num[1].length()-Integer.parseInt(line[1])),srp="",snrp="1";
        for(int i=0;i<rp.length();i++)srp+="9";
        for(int i=0;i<nrp.length();i++)snrp+="0";
        long rp1 = Integer.parseInt(rp),rp2 = Integer.parseInt(srp),nrp1=Integer.parseInt(nrp.length()==0?"0":nrp),nrp2=Integer.parseInt(snrp),front = Integer.parseInt(num[0]);
        long gcd1 = gcd(rp1,rp2), gcd2 = gcd(nrp1,nrp2), offset = nrp2;
        rp1 /=gcd1; rp2/=gcd1; nrp1/=gcd2; nrp2/=gcd2; rp2*=offset;
        long a = rp1*nrp2 + nrp1*rp2, b = nrp2*rp2, gcd = gcd(a,b);
        System.out.println((a/gcd +front*b/gcd) +"/"+b/gcd);
    }
    static long gcd(long a, long b){
        if(a == 0 || b == 0) return a+b;
        return gcd(b,a%b);
    }
}
