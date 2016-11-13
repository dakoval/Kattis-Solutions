package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class natjecanje {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int N = Integer.parseInt(s[0]); //total teams
        int S = Integer.parseInt(s[1]); //damaged kayaks
        int R = Integer.parseInt(s[2]); //reserve kayaks
        int[] teams = new int[N];
        s = in.readLine().split(" ");
        for (int i = 0; i < S; i++) {
            teams[Integer.parseInt(s[i]) - 1] = -1;
        }
        s = in.readLine().split(" ");
        for (int i = 0; i < R; i++) {
            int x = Integer.parseInt(s[i]) - 1;
            if (teams[x] == -1) {
                teams[x] = 0;
            } else {
                teams[x] = 1;
            }

        }
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                if (teams[i] == 1 && teams[i + 1] == -1) {
                    teams[i] = 0;
                    teams[i + 1] = 0;
                }
            } else if (i == N - 1) {
                if (teams[N - 1] == 1 && teams[N - 2] == -1) {
                    teams[N - 1] = 0;
                    teams[N - 2] = 0;
                }
            } else if (teams[i] == 1) {
                if (teams[i - 1] == -1) {
                    teams[i - 1] = 0;
                    teams[i] = 0;
                } else if (teams[i + 1] == -1) {
                    teams[i + 1] = 0;
                    teams[i] = 0;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (teams[i] == -1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
