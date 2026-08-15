import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[93];
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
        sc.close();
    }
}
