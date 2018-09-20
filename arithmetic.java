
package code.club;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author DavidKoval
 */
public class arithmetic {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger b = new BigInteger(br.readLine(),8);
        System.out.println(b.toString(16).toUpperCase());
    }
    
}
