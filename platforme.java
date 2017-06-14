package Solutions;

/**
 *
 * @author Max
 */
import java.util.*;

public class platforme {

    static class P implements Comparable<P> {

        int l, x1, x2;

        P(int l, int x1, int x2) {
            this.l = l;
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public int compareTo(P p) {
            return this.l - p.l;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        P arr[] = new P[n];
        for (int i = 0; i < n; i++) {
            P p = new P(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr[i] = p;
        }
        Arrays.sort(arr);
        int leng = 0;
        for (int i = 0; i < n; i++) {
            int bestlen = arr[i].l;
            for (int j = 0; j < i; j++) {//left leg
                if (arr[j].x1 <= arr[i].x1 && arr[j].x2 > arr[i].x1) {
                    bestlen = arr[i].l - arr[j].l < bestlen ? arr[i].l - arr[j].l : bestlen;
                }
            }
            leng += bestlen;
            bestlen = arr[i].l;
            for (int j = 0; j < i; j++) {//right leg
                if (arr[j].x1 < arr[i].x2 && arr[j].x2 >= arr[i].x2) {
                    bestlen = arr[i].l - arr[j].l < bestlen ? arr[i].l - arr[j].l : bestlen;
                }
            }
            leng += bestlen;
        }
        System.out.println(leng);
    }
}
