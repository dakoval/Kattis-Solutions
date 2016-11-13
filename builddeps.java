
package Solutions;

/**
 *
 * @author kovalda
 */
import java.util.*;
import java.io.*;
public class builddeps {
    static Map<String, Set<String>> up;
    static Map<String, Boolean> vst;
    static ArrayList<String> list;
    public static void main(String[] args) throws Exception{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        up = new HashMap<>();
        list = new ArrayList<>();
        vst = new HashMap<>();
        int num = Integer.parseInt(sc.readLine());
        for(int i=0;i<num;i++){
            String[] line = sc.readLine().split(" ");
            String loc = line[0].substring(0, line[0].length()-1);
            if(!up.containsKey(loc)){
                up.put(loc, new HashSet<String>());
                vst.put(loc, false);
            }
            for(int j=1;j<line.length;j++){
                vst.put(line[j], false);
                if(up.containsKey(line[j]))up.get(line[j]).add(loc);
                else{
                    Set <String> s = new HashSet<>();
                    s.add(loc);
                    up.put(line[j], s);
                }
            }        
        }
        dfs(sc.readLine());
        for(int i=list.size()-1;i>=0;i--)System.out.println(list.get(i));
    }
    
    static void dfs(String s){
        if(vst.get(s).booleanValue()==true)return;
        for(String st :up.get(s))dfs(st);
        if(vst.get(s).booleanValue()==false){
            list.add(s);
            vst.put(s, true);
        }
        return;
    }
}
