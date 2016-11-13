/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solutions;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 *
 * @author David
 */
public class cookieselection {
    
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
        
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> max = new PriorityQueue<>();
        int middle=0;
        int n = 0;
        
        while(io.hasMoreTokens()){
            String s=io.nextToken();
            if(s.equals("#")){
                if(n>1){
                    n--;
                    System.out.println(middle);
                    if(min.size()>max.size()){
                        middle=min.poll();
                    }else{
                        middle=max.poll();
                    }
                }else if(n==1){
                    System.out.println(middle);
                    n--;
                }else{
                    
                }
            }else{
                int i=Integer.parseInt(s);
                if(n==0){
                    middle=i;
                }
                else{
                    if(i<middle){
                        if(min.size()<=max.size()){
                            min.add(i);
                        }else{
                            max.add(middle);
                            min.add(i);
                            middle=min.poll();
                        }
                    }else{
                        if(min.size()>max.size()){
                            max.add(i);
                        }else{
                            min.add(middle);
                            max.add(i);
                            middle=max.poll();
                        }
                    } 
                } 
                n++;
            }
        }
    }
}
