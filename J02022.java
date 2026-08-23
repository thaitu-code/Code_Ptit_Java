import java.util.Scanner;

public class J02022 {

    static int n;
    static int[] arr = new int[10];
    static int[] x = new int[10];

    public static boolean check() {
        for (int i = 1; i <= n - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == 1)
                return false;
        }
        return true;
    }

    public static void quay(int i) {
        for (int j = 1; j <= n; j++) {
            if (x[j] == 0) {
                arr[i] = j;
                x[j] = 1;
                if (i == n) {
                    if (check()) {
                        for (int k = 1; k <= n; k++) {
                            System.out.print(arr[k]);
                        }
                        System.out.println();
                    }
                } else
                    quay(i + 1);
                x[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            for (int j = 1; j <= n; j++) {
                x[j] = 0;
            }
            quay(1);
        }
    }
}
