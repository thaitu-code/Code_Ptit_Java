import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J02009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            Pair[i][0] = sc.nextInt();
            Pair[i][1] = sc.nextInt();
        }
        Arrays.sort(Pair, Comparator.comparingInt(a -> a[0]));
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt < Pair[i][0]) {
                cnt = Pair[i][0];
            }
            cnt += Pair[i][1];
        }
        System.out.println(cnt);
    }
}
