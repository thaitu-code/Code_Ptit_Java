import java.util.Scanner;

public class J02008 {

    public static long ucln(long a, long b) {
        if (b == 0)
            return a;
        return ucln(b, a % b);
    }

    public static long bcnn(long a, long b) {
        return a * b / ucln(a, b);
    }

    public static long solve(long n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = bcnn(ans, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
