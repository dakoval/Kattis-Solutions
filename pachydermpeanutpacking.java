package Solutions;

/**
 *
 * @author Max
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class pachydermpeanutpacking {

    static class Box {

        double x1, x2, y1, y2;
        String type;

        Box(double x1, double y1, double x2, double y2, String type) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            this.type = type;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String[] strs;
            Set<Box> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                strs = br.readLine().split(" ");
                set.add(new Box(Double.parseDouble(strs[0]), Double.parseDouble(strs[1]), Double.parseDouble(strs[2]), Double.parseDouble(strs[3]), strs[4]));
            }
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                strs = br.readLine().split(" ");
                double x = Double.parseDouble(strs[0]), y = Double.parseDouble(strs[1]);
                String s = strs[2];
                boolean t = false;
                for (Box b : set) {
                    if (b.x1 <= x && b.x2 >= x && b.y1 <= y && b.y2 >= y) {
                        t = true;
                        if (b.type.equals(s)) {
                            bw.write(s + " correct\n");
                        } else {
                            bw.write(s + " " + b.type + "\n");
                        }
                        break;
                    }
                }
                if (!t) {
                    bw.write(s + " floor\n");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
