package Solutions;

/**
 *
 * @author Max
 */
import java.io.*;
import java.util.*;

public class porpoises {

    static Map<Long, Long> map = new HashMap<>();
    static long mod = 1000000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        map.put((long) 1, (long) 0);
        map.put((long) 2, (long) 1);
        map.put((long) 3, (long) 1);
        String[] strs = br.readLine().split(" ");
        int tc = Integer.parseInt(strs[0]);
        while (tc-- > 0) {
            strs = br.readLine().split(" ");
            bw.write(strs[0] + " " + fib(Long.parseLong(strs[1]) + 1) + "\n");
        }
        bw.flush();
    }

    static long fib(long n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        long x;
        if (n % 2 == 0) {
            x = (fib(n / 2 + 1) * fib(n / 2 + 1) + fib(n / 2) * fib(n / 2)) % mod;
        } else {
            x = (2 * fib(n / 2) * fib(n / 2 + 1) + fib(n / 2 + 1) * fib(n / 2 + 1)) % mod;
        }
        map.put(n, x);
        return x;
    }
}
