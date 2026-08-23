import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n + 2];
            int[] pre = new int[n + 2];
            int[] suf = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
                pre[i] = suf[i] = 0;
            }
            if (n == 1) {
                System.out.println(1);
                t -= 1;
                continue;
            }
            pre[0] = suf[n + 1] = 0;
            boolean ok = false;
            for (int i = 1; i <= n; i++)
                pre[i] = pre[i - 1] + arr[i];
            for (int i = n; i >= 1; i--)
                suf[i] = suf[i + 1] + arr[i];
            for (int i = 1; i <= n; i++) {
                if (pre[i - 1] == suf[i + 1]) {
                    System.out.println(i);
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println(-1);
            }
            t -= 1;
        }

    }
}
