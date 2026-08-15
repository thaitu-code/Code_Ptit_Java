import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long x = sc.nextLong();
            long ans = x * (x + 1) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}
