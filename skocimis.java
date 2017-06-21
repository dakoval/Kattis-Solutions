package Solutions;

/**
 *
 * @author Max
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class skocimis {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int a = Integer.parseInt(strs[0]), b = Integer.parseInt(strs[1]), c = Integer.parseInt(strs[2]);
        System.out.println(Math.max(c - b - 1, Math.max(b - a - 1, 0)));
    }
}
