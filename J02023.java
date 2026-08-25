import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int n1 = n, sum = s;
        if (s == 0 || 9 * n < s) {
            System.out.println(-1 + " " + -1);
        } else {
            String s1 = "";
            while (n > 0) {
                if (s > 9) {
                    s1 += "9";
                    s -= 9;
                } else {
                    if (n == 1) {
                        s1 += String.valueOf(s);
                    } else {
                        s1 += String.valueOf(s - 1);
                        n -= 1;
                        while (n > 1) {
                            s1 += "0";
                            n -= 1;
                        }
                        s1 += "1";
                    }
                }
                n -= 1;
            }
            String reverse_s1 = new StringBuilder(s1).reverse().toString();
            System.out.print(reverse_s1 + " ");
            String s2 = "";
            while (n1 > 0) {
                if (sum > 9) {
                    s2 += "9";
                    sum -= 9;
                } else {
                    s2 += String.valueOf(sum);
                    n1 -= 1;
                    while (n1 > 0) {
                        s2 += "0";
                        n1 -= 1;
                    }
                }
                n1 -= 1;
            }
            System.out.println(s2);

        }
    }
}
