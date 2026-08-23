import java.util.Scanner;

public class J01013 {

    static int[] prime = new int[2000003];

    public static void snt() {
        for (int i = 1; i <= 2000000; i++) {
            prime[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(2000000); i++) {
            if (prime[i] == i) {
                for (int j = i * i; j <= 2000000; j += i) {
                    prime[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        snt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n == 1) {
                ans += 1;
                continue;
            }
            while (prime[n] != 1) {
                ans += prime[n];
                n /= prime[n];
            }

        }
        System.out.print(ans);
        sc.close();
    }
}
