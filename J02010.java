import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * J02010
 */
public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    Collections.swap(arr, i, j);
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                if (k != n - 1) {
                    System.out.print(arr.get(k) + " ");
                } else {
                    System.out.print(arr.get(k));
                }
            }
            System.out.print("\n");
        }
    }

}