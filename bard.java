
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author DavidKoval
 */
public class bard { 
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++)map.put(i, new HashSet<Integer>());
        int m = Integer.parseInt(br.readLine());
        int bardKnows=0;
        for(int i=0;i<m;i++){
            String[] vil = br.readLine().split(" ");
            boolean bard = false;
            for(int j=1;j<vil.length;j++)if(vil[j].equals("1")){
                bard=true;
                break;
            }
            if(bard){
                ++bardKnows;
                for(int j=1;j<vil.length;j++){
                    map.get(Integer.parseInt(vil[j])).add(bardKnows);
                }
            }else{
                HashSet<Integer> all = new HashSet<>();
                for(int j=1;j<vil.length;j++){
                    all.addAll(map.get(Integer.parseInt(vil[j])));
                }
                for(int j=1;j<vil.length;j++){
                    map.get(Integer.parseInt(vil[j])).addAll(all);
                }
            }
        }
        int max=map.get(1).size();
        for(int i=1;i<=n;i++){
            if(map.get(i).size()==max){
                System.out.println(i);
            }
        }
    }
}
