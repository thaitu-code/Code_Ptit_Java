
import java.util.Scanner;

public class J01023 {

    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != '?' && s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void solve(String s) {
        String[] Parts = s.split("\\s+");
        if (Parts[1].compareTo("/") == 0 || Parts[1].compareTo("*") == 0) {
            System.out.println("WRONG PROBLEM!");
            return;
        }
        for (int i = 10; i <= 99; i++) {
            String s1 = String.valueOf(i);
            if (!check(Parts[0], s1))
                continue;
            for (int j = 10; j <= 99; j++) {
                String s2 = String.valueOf(j);
                if (!check(Parts[2], s2))
                    continue;
                for (int k = 10; k <= 99; k++) {
                    String s3 = String.valueOf(k);
                    if (!check(Parts[4], s3)) {
                        continue;
                    }
                    if (Parts[1].compareTo("-") == 0) {
                        int tmp = i - j;
                        if (tmp == k) {
                            System.out.printf("%d - %d = %d\n", i, j, k);
                            return;
                        }
                    } else if (Parts[1].compareTo("+") == 0) {
                        int tmp = i + j;
                        if (tmp == k) {
                            System.out.printf("%d + %d = %d\n", i, j, k);
                            return;
                        }
                    } else {
                        if (i + j == k) {
                            System.out.printf("%d + %d = %d\n", i, j, k);
                            return;
                        } else if (i - j == k) {
                            System.out.printf("%d - %d = %d\n", i, j, k);
                            return;
                        }
                    }
                }

            }
        }
        System.out.println("WRONG PROBLEM!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine();
            solve(s);
        }
        sc.close();
    }
}
