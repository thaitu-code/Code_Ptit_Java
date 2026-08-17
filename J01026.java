import java.util.Scanner;

public class J01026 {

    public static boolean check(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (check(n)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();
    }
}
