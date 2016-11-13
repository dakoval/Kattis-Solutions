/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

/**
 *
 * @author David
 */
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
    class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
	String ans = peekToken();
	token = null;
	return ans;
    }
}
public class rockpaperscissors {
    public static void main(String[] args)throws Exception { 
        Kattio io = new Kattio(System.in,System.out);
        while(true){
            int p = io.getInt();
            if(p==0)break;
            int g=io.getInt();
            g= ((g*p*(p-1))/2);
            int [] t = new int[((2*p)+2)]; 
            for(int i=0;i<g;i++){
                int p1 = io.getInt();String p1m = io.getWord();
                int p2 = io.getInt();String p2m = io.getWord();
                if(!p1m.equals(p2m)){
                    t[2*p1+1]++;t[2*p2+1]++;
                    if(p1m.equals("rock")){
                        if(p2m.equals("paper"))t[2*p2]++;
                        else t[2*p1]++;
                    }
                    if(p1m.equals("paper")){
                        if(p2m.equals("scissors"))t[2*p2]++;
                        else t[2*p1]++;
                    }
                    if(p1m.equals("scissors")){
                        if(p2m.equals("rock"))t[2*p2]++;
                        else t[2*p1]++;
                    }
                }
            }
            for(int i=2;i<t.length;i+=2){
                if(t[i+1]==0)System.out.println("-");
                else{double y= (double)t[i]/t[i+1];
                    System.out.printf("%.3f\n", y);
                    }
            }System.out.println();
        }
    }
}
