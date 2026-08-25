import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class J02026 {

    static int n, k;
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static int ok = 0;
    static int[] a = new int[100];

    public static void ktao() {
        for (int i = 1; i <= k; i++) {
            arr.add(i);
        }
    }

    public static void sinh() {
        int i = k;
        while (i >= 1 && arr.get(i - 1) == n - k + i) {
            i--;
        }
        if (i == 0)
            ok = 1;
        else {
            arr.set(i - 1, arr.get(i - 1) + 1);
            for (int j = i; j < k; j++) {
                arr.set(j, arr.get(j - 1) + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr.clear();
            ok = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a, 0, n);
            ktao();
            while (ok == 0) {
                for (int j = 0; j < k; j++) {
                    System.out.print(a[arr.get(j) - 1] + " ");
                }
                System.out.println();
                sinh();
            }
        }
        sc.close();

    }
}
