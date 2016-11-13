package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;
import java.io.*;

public class anewalphabet {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] s = in.readLine().toLowerCase().toCharArray();
        Map<Character, String> map = new HashMap<>();
        map.put('a', "@");
        map.put('b', "8");
        map.put('c', "(");
        map.put('d', "|)");
        map.put('e', "3");
        map.put('f', "#");
        map.put('g', "6");
        map.put('h', "[-]");
        map.put('i', "|");
        map.put('j', "_|");
        map.put('k', "|<");
        map.put('l', "1");
        map.put('m', "[]\\/[]");
        map.put('n', "[]\\[]");
        map.put('o', "0");
        map.put('p', "|D");
        map.put('q', "(,)");
        map.put('r', "|Z");
        map.put('s', "$");
        map.put('t', "']['");
        map.put('u', "|_|");
        map.put('v', "\\/");
        map.put('w', "\\/\\/");
        map.put('x', "}{");
        map.put('y', "`/");
        map.put('z', "2");
        String sen = "";
        for (int i = 0; i < s.length; i++) {
            if (map.containsKey(s[i])) {
                sen += map.get(s[i]);
            } else {
                sen += s[i];
            }
        }
        System.out.println(sen);
    }
}
