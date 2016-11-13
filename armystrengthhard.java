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
public class armystrengthhard {
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
        int c = io.getInt();
        for(int i=0;i<c;i++){
            List<Integer> G = new ArrayList<>();
            List<Integer> M = new ArrayList<>();
            int Ga = io.getInt();int Ma = io.getInt();
            for(int j=0;j<Ga;j++)G.add(io.getInt());
            for(int j=0;j<Ma;j++)M.add(io.getInt());
            Collections.sort(M);
            Collections.sort(G);
            int m=0,g=0;
            while(m<M.size()&&g<G.size()){
                
                if(G.get(g)>=M.get(m))m++;
                else g++;
            }
            if(m==M.size()&&g==G.size())System.out.println("uncertain");
            else if(m==M.size())System.out.println("Godzilla");
            else System.out.println("MechaGodzilla");
            
        }
    }
}
