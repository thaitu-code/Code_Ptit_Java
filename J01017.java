import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine();
            int ok = 1;
            for (int j = 1; j < s.length(); j++) {
                if (Math.abs(s.charAt(j - 1) - s.charAt(j)) != 1) {
                    ok = 0;
                    break;
                }
            }
            if (ok == 1) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();

    }
}
