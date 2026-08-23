import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int ok = 0;
            for (int j = 2; j < n; j++) {
                long c = (long) Math.pow(arr[j], 2);
                int l = 0, r = j - 1;
                while (l < r) {
                    long tmp = (long) Math.pow(arr[l], 2) + (long) Math.pow(arr[r], 2);
                    if (tmp == c) {
                        ok = 1;
                        break;
                    } else if (tmp < c) {
                        l += 1;
                    } else
                        r -= 1;
                }
                if (ok == 1)
                    break;
            }
            if (ok == 1) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
