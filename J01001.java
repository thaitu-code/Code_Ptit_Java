import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a <= 0 || b <= 0) {
            System.out.print(0);
        } else
            System.out.print((a + b) * 2 + " " + a * b);
        sc.close();
    }
}
