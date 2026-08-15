import java.util.Scanner;

public class J01021 {

    static int mod = 1000000007;

    static long luythua(long a, long b) {
        if (b == 0)
            return 1;
        long res = luythua(a, b / 2);
        if (b % 2 == 0) {
            return res % mod * res % mod;
        } else
            return res % mod * res % mod * a % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(luythua(a, b));
        }
        sc.close();
    }
}
