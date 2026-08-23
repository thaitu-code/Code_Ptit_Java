import java.util.ArrayList;
import java.util.Scanner;

public class J02020 {

    static int n, k;
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    static int ok = 0;

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
        n = sc.nextInt();
        k = sc.nextInt();
        ktao();
        int cnt = 0;
        while (ok == 0) {
            cnt += 1;
            for (int i = 0; i < k; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
            sinh();
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
