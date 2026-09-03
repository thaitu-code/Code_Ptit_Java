import java.util.Arrays;
import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sorted_a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sorted_a[i] = a[i];
            }
            Arrays.sort(sorted_a);
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == sorted_a[0]) {
                    cnt = i;
                    break;
                }
            }
            System.out.println(cnt);

        }
        sc.close();
    }
}
