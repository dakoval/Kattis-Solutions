
package Solutions;

import java.util.*;
import java.io.*;
public class reversingroads {
    static List<Integer>[] graph;
    static boolean[] visited;
    static Stack<Integer> stack;
    static int time;
    static int[] lowlink;
    static List<List<Integer>> components;
    static String[] point;
    static boolean[] p;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int c=0;
        while(sc.hasNext()){
            ++c;
            int m = sc.nextInt();
            int n = sc.nextInt();
            graph = new List[m];
            point = new String[n];
            p=new boolean[n];
            for (int i = 0; i < graph.length; i++)graph[i] = new ArrayList<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a].add(b);
                point[i]=a+" "+b;
            }
            if(scc())System.out.println("Case "+c+": valid");
            else{
                int a,b;
                boolean inv=true;
                for(int i=0;i<m;i++){
                    for(int j=0;j<graph[i].size();j++){
                        a=i;
                        b = graph[a].remove(0);
                        graph[b].add(a);
                        if(scc()){
                            inv=false;
                            for(int k=0;k<n;k++)if(point[k].equals(a+" "+b))p[k]=true;
                        }
                        graph[a].add(b);
                        graph[b].remove(graph[b].size()-1);
                    }
                }
                if(inv)System.out.println("Case "+c+": invalid");
                else{
                    for(int i=0;i<n;i++)if(p[i]){System.out.println("Case "+c+": "+point[i]); break;}
                }
            }
        }
    }



  static boolean scc() {
    int n = graph.length;
    visited = new boolean[n];
    stack = new Stack<>();
    time = 0;
    lowlink = new int[n];
    components = new ArrayList<>();

    for (int u = 0; u < n; u++)if (!visited[u])dfs(u);
    boolean x =true;
    for(int i=0;i<n;i++)if(!components.get(0).contains(i))x=false;
    return x;
  }

  static void dfs(int u) {
    lowlink[u] = time++;
    visited[u] = true;
    stack.add(u);
    boolean isComponentRoot = true;

    for (int v : graph[u]) {
      if (!visited[v])
        dfs(v);
      if (lowlink[u] > lowlink[v]) {
        lowlink[u] = lowlink[v];
        isComponentRoot = false;
      }
    }

    if (isComponentRoot) {
      List<Integer> component = new ArrayList<>();
      while (true) {
        int x = stack.pop();
        component.add(x);
        lowlink[x] = Integer.MAX_VALUE;
        if (x == u)
          break;
      }
      components.add(component);
    }
  }
}