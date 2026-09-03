import java.util.Scanner;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n + 1];
            long[] pre = new long[n + 1];
            for (int j = 1; j <= n; j++) {
                a[j] = sc.nextInt();
                pre[j] = 0;
            }
            pre[0] = 0;
            for (int j = 1; j <= n; j++) {
                pre[j] = pre[j - 1] + a[j];
            }
            int ok = 0;
            for (int j = 0; j <= n; j++) {
                int l = j + 1, r = n;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if (pre[m] - pre[j] == k) {
                        ok = 1;
                        break;
                    } else if (pre[m] - pre[j] > k) {
                        r = m - 1;
                    } else
                        l = m + 1;
                }
                if (ok == 1)
                    break;
            }
            if (ok == 1) {
                System.out.println("YES");
            } else
                System.out.println("NO");

        }
    }
}
