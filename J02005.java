import java.util.TreeSet;
import java.util.Scanner;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> s1 = new TreeSet<Integer>();
        TreeSet<Integer> s2 = new TreeSet<Integer>();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            s1.add(x);
        }
        for (int j = 1; j <= m; j++) {
            int x = sc.nextInt();
            s2.add(x);
        }

        for (Integer j : s1) {
            if (s2.contains(j)) {
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}
