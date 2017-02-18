package Solutions;

import java.util.*;

public class modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            s.add(sc.nextInt() % 42);
        }
        System.out.println(s.size());
    }
}
