import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }
        for (int j = 1; j <= m; j++) {
            int x = sc.nextInt();
            s.add(x);
        }

        for (Integer j : s) {
            System.out.print(j + " ");
        }
        sc.close();
    }
}