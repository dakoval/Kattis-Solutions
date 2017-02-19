package Solutions;

import java.util.*;

public class asciifigurerotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) {
                break;
            }
            if (first++ != 0) {
                System.out.println();
            }
            char[][] c = new char[n][n];
            char a;
            int len = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                if (len < s.length()) {
                    len = s.length();
                }
                for (int j = s.length() - 1; j < 100; j++) {
                    s += "s";
                }
                c[i] = s.toCharArray();
            }
            String[] c2 = new String[n];
            for (int j = 0; j < len; j++) {
                for (int i = n - 1; i >= 0; i--) {
                    a = c[i][j];
                    if (a == '|') {
                        c2[i] = "-";
                    } else if (a == '-') {
                        c2[i] = "|";
                    } else if (a == 's') {
                        c2[i] = "s";
                    } else if (a == ' ') {
                        c2[i] = " ";
                    } else {
                        c2[i] = a + "";
                    }
                }
                for (int i = 0; i < c2.length; i++) {
                    if (c2[i] == "s" || c2[i] == " ") {
                        c2[i] = "";
                    } else {
                        break;
                    }
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (c2[i].equals("s")) {
                        System.out.print(" ");
                    } else {
                        System.out.print(c2[i]);
                    }
                }
                System.out.println();
            }
        }
    }
}
