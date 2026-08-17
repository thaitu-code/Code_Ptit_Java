import java.util.Scanner;

public class J01022 {
    static long[] fibo = new long[93];

    public static void genFibo() {
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static char Find(int n, long k) {
        if (n == 1)
            return '0';
        if (n == 2)
            return '1';
        if (k <= fibo[n - 2]) {
            return Find(n - 2, k);
        } else
            return Find(n - 1, k - fibo[n - 2]);
    }

    public static void main(String[] args) {
        genFibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Find(n, k));
        }
        sc.close();
    }
}
