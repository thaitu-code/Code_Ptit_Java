import java.util.Scanner;
import java.util.TreeMap;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.printf("%d(%d)\n", 1, 1);
                continue;
            }
            System.out.print("Test " + i + ": ");
            for (int j = 2; j <= Math.sqrt(n); j++) {
                while (n % j == 0) {
                    if (mp.containsKey(j)) {
                        int x = mp.get(j);
                        x += 1;
                        mp.put(j, x);
                    } else
                        mp.put(j, 1);
                    n /= j;
                }
            }
            if (n > 1)
                mp.put(n, 1);
            for (int x : mp.keySet()) {
                System.out.printf("%d(%d) ", x, mp.get(x));
            }
            System.out.print("\n");
            mp.clear();
        }

        sc.close();
    }
}
