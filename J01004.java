import java.util.Scanner;

public class J01004 {

    static boolean check(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int x = sc.nextInt();
            if (check(x)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();
    }
}
