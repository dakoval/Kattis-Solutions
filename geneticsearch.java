package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class geneticsearch {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] st = br.readLine().split(" ");
            if (st[0].equals("0")) {
                break;
            }
            String[] L = {"A", "G", "C", "T"};
            int a = 0, b = 0, c = 0;
            //without changes
            a = countMatches(Pattern.compile(st[0]), st[1]);
            //deletion
            Set<String> set = new HashSet<>();
            for (int i = 0; i < st[0].length(); i++) {
                String s = st[0].substring(0, i) + st[0].substring(i + 1, st[0].length());
                if (!set.contains(s)) {
                    set.add(s);
                    b += countMatches(Pattern.compile(s), st[1]);
                }
            }
            //with Insertion
            set = new HashSet<>();
            for (int i = 0; i <= st[0].length(); i++) {
                for (int j = 0; j < 4; j++) {
                    String s = st[0].substring(0, i) + L[j] + st[0].substring(i, st[0].length());
                    if (!set.contains(s)) {
                        set.add(s);
                        c += countMatches(Pattern.compile(s), st[1]);
                    }
                }

            }
            System.out.println(a + " " + b + " " + c);
        }

    }

    static int countMatches(Pattern p, String s) {
        Matcher m = p.matcher(s);
        int cnt = 0, pos = 0;
        while (m.find(pos)) {
            cnt++;
            pos = m.start() + 1;
        }
        return cnt;
    }
}
