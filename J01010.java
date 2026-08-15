import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            boolean ok = false;
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                    ans += '0';
                } else if (s.charAt(i) == '1')
                    ans += '1';
                else {
                    ok = true;
                    break;
                }
            }
            if (ok) {
                System.out.println("INVALID");
            } else {
                int i = 0;
                while (i < ans.length() && ans.charAt(i) == '0')
                    i++;
                if (i == ans.length())
                    System.out.println("INVALID");
                else {
                    while (i < ans.length()) {
                        System.out.print(ans.charAt(i));
                        i++;
                    }
                    System.out.println("\n");
                }
            }
            t--;
        }
        sc.close();
    }
}
