import java.util.HashMap;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int maxInteger = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            mp.put(a[i], 1);
            maxInteger = Math.max(maxInteger, a[i]);
        }
        int ok = 0;
        for (int i = 1; i <= maxInteger; i++) {
            if (mp.containsKey(i) == false) {
                ok = 1;
                System.out.println(i);
            }
        }
        if (ok == 0) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
