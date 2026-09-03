import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int j = 0; j < n - 1; j++) {
                int l = j + 1, r = n - 1;
                int tmp = -1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (a[m] - a[j] < k) {
                        l = m + 1;
                        tmp = m;
                    } else {
                        r = m - 1;
                    }
                }
                if (tmp != -1) {
                    ans += tmp - j;
                }

            }
            System.out.println(ans);
        }
        sc.close();
    }

}
