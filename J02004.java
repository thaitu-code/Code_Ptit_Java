import java.util.Scanner;

public class J02004 {

    static boolean check(int[] a, int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (a[i] != a[n - i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n + 2];
            for (int j = 1; j <= n; j++) {
                a[j] = sc.nextInt();
            }
            if (check(a, n)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();
    }
}