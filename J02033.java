import java.util.Arrays;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0)
                cnt1++;
            else
                cnt2++;
        }
        long ans = 0;
        Arrays.sort(a);
        if (cnt1 == 0) {
            if (k % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    ans += a[i];
                }
            } else {

                a[0] *= -1;
                for (int i = 0; i < n; i++) {
                    ans += a[i];
                }
            }
        } else {
            if (k <= cnt1) {
                for (int i = 0; i < k; i++) {
                    a[i] *= -1;
                }
                for (int i = 0; i < n; i++) {
                    ans += a[i];
                }
            } else {
                for (int i = 0; i < cnt1; i++) {
                    a[i] *= -1;
                }
                if ((k - cnt1) % 2 == 0) {
                    for (int i = 0; i < n; i++) {
                        ans += a[i];
                    }
                } else {
                    Arrays.sort(a);
                    a[0] *= -1;
                    for (int i = 0; i < n; i++) {
                        ans += a[i];
                    }
                }

            }
        }
        System.out.println(ans);
        sc.close();

    }
}
