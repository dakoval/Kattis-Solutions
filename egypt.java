package code.club;

import java.io.*;
public class egypt {
    static int a,b,c;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] line = br.readLine().split(" ");
            a=Integer.parseInt(line[0]);b=Integer.parseInt(line[1]);c=Integer.parseInt(line[2]);
            if(a==0 && b==0 && c==0)break;
            if(a>b){int temp = a;a=b;b=temp;}
            if(b>c){int temp = b;b=c;c=temp;}
            System.out.println(c*c==a*a+b*b?"right":"wrong");
        } 
    }
}
