import java.util.ArrayList;
import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int tmp = arr.get(i);
            while (j >= 0 && arr.get(j) > tmp) {

                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, tmp);
            System.out.print("Buoc " + i + ": ");
            for (j = 0; j <= i; j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
