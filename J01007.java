import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[94];
        a[1] = 0;
        a[2] = 1;
        for (int i = 3; i <= 93; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            boolean ok = false;
            for (int j = 1; j <= 92; j++) {
                if (n == a[j]) {
                    ok = true;
                    System.out.println("YES");
                    break;
                }
            }
            if (!ok) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
