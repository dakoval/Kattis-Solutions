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
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class phonelist {
    static class Kattio extends PrintWriter {
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
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in,System.out);
        int n =io.getInt();
        for(int i=0;i<n;i++){
            ArrayList<String> a = new ArrayList<>();
            int n2=io.getInt();
            for(int j=0;j<n2;j++)a.add(io.getWord());
            Collections.sort(a);
            boolean t = true;
            for(int j=1;j<n2;j++){
                if(a.get(j).length()>a.get(j-1).length()){
                    if(a.get(j).substring(0, a.get(j-1).length()).equals(a.get(j-1)))t=false;
                }
                else{
                    if(a.get(j-1).substring(0, a.get(j).length()).equals(a.get(j)))t=false;
                }
            }
            if(t)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
