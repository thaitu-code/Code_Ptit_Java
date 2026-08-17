import java.util.Scanner;

public class J01024 {

    public static boolean check(int x) {
        while (x > 0) {
            if (x % 10 != 0 && x % 10 != 1 && x % 10 != 2) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            if (check(x)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
