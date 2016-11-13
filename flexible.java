package Solutions;


import java.io.*;
import java.util.*;

public class flexible {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter wr = new PrintWriter(new OutputStreamWriter(System.out));
        while (sc.hasNext()) {
            int l = sc.nextInt();
            int n = sc.nextInt() + 1;
            int places[] = new int[n];
            places[n - 1] = l;
            SortedSet<Integer> list = new TreeSet<>();
            for (int i = 0; i < n - 1; i++) {
                places[i] = sc.nextInt();
            }
            Arrays.sort(places);
            for (int i = 0; i < n; i++) {
                list.add(places[i]);
                for (int j = i + 1; j < n; j++) {
                    list.add(places[j] - places[i]);
                }
            }

            for (int x : list) {
                wr.print(x + " ");
            }
            wr.println();
            wr.flush();
        }
    }
}
