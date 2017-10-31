package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class lostmap {

    static class Graph {

        class Edge implements Comparable<Edge> {

            int src, dest, weight;

            public int compareTo(Edge compareEdge) {
                return this.weight - compareEdge.weight;
            }
        };

        class subset {

            int parent, rank;
        };
        int V, E;
        Edge edge[];

        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new Edge[E];
            for (int i = 0; i < e; ++i) {
                edge[i] = new Edge();
            }
        }

        int find(subset subsets[], int i) {
            if (subsets[i].parent != i) {
                subsets[i].parent = find(subsets, subsets[i].parent);
            }
            return subsets[i].parent;
        }

        void Union(subset subsets[], int x, int y) {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);
            if (subsets[xroot].rank < subsets[yroot].rank) {
                subsets[xroot].parent = yroot;
            } else if (subsets[xroot].rank > subsets[yroot].rank) {
                subsets[yroot].parent = xroot;
            } else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }

        void KruskalMST() {
            Edge result[] = new Edge[V];
            int e = 0, i = 0;
            for (i = 0; i < V; ++i) {
                result[i] = new Edge();
            }
            Arrays.sort(edge);
            subset subsets[] = new subset[V];
            for (i = 0; i < V; ++i) {
                subsets[i] = new subset();
            }
            for (int v = 0; v < V; ++v) {
                subsets[v].parent = v;
                subsets[v].rank = 0;
            }
            i = 0;
            while (e < V - 1) {
                Edge next_edge = new Edge();
                next_edge = edge[i++];
                int x = find(subsets, next_edge.src);
                int y = find(subsets, next_edge.dest);
                if (x != y) {
                    result[e++] = next_edge;
                    Union(subsets, x, y);
                }
            }
            for (i = 0; i < e; ++i) {
                System.out.println((result[i].src + 1) + " " + (result[i].dest + 1));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        Graph g = new Graph(n, (n * n - n) / 2);
        for (int i = 0; i < n; i++) {
            String strs[] = br.readLine().split(" ");
            for (int j = i + 1; j < n; j++) {
                g.edge[x].src = i;
                g.edge[x].dest = j;
                g.edge[x].weight = Integer.parseInt(strs[j]);
                x++;
            }
        }
        g.KruskalMST();
    }
}
