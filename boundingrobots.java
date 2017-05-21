package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class boundingrobots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            int ax = 0, ay = 0, rx = 0, ry = 0;
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String dir = sc.next();
                int dis = sc.nextInt();
                if (dir.equals("u")) {
                    ry += dis;
                    ay += dis;
                    if (ay >= y) {
                        ay = y - 1;
                    }
                } else if (dir.equals("d")) {
                    ry -= dis;
                    ay -= dis;
                    if (ay < 0) {
                        ay = 0;
                    }
                } else if (dir.equals("r")) {
                    rx += dis;
                    ax += dis;
                    if (ax >= x) {
                        ax = x - 1;
                    }
                } else if (dir.equals("l")) {
                    rx -= dis;
                    ax -= dis;
                    if (ax < 0) {
                        ax = 0;
                    }
                }
            }
            System.out.println("Robot thinks " + rx + " " + ry);
            System.out.println("Actually at " + ax + " " + ay + "\n");
        }
    }
}
