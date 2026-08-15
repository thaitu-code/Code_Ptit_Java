import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine();
            int ok = 1;
            int sum = s.charAt(0) - '0';
            for (int j = 1; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
                if (Math.abs(s.charAt(j - 1) - s.charAt(j)) != 2) {
                    ok = 0;
                }
            }
            if (ok == 1 && sum % 10 == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();

    }
}
