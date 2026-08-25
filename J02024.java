import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024 {

    static int n;
    static Integer[] arr = new Integer[100];
    static int[] x = new int[100];
    static ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();

    static boolean check(int sum) {
        if (sum % 2 == 1)
            return true;
        return false;
    }

    static void quay(int i, int sum, ArrayList<Integer> a) {
        for (int j = i; j < n; j++) {
            if (x[j] == 0) {
                a.add(arr[j]);
                x[j] = 1;
                sum += arr[j];
                if (check(sum)) {
                    tmp.add(new ArrayList<Integer>(a));
                }
                if (i < n - 1) {
                    quay(j + 1, sum, a);
                }
                x[j] = 0;
                sum -= arr[j];
                a.remove(a.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            tmp.clear();
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                x[j] = 0;
            }
            Arrays.sort(arr, 0, n, Collections.reverseOrder());
            ArrayList<Integer> a = new ArrayList<Integer>();
            quay(0, 0, a);
            tmp.sort((arr1, arr2) -> {
                int size_arr = Math.min(arr1.size(), arr2.size());
                for (int j = 0; j < size_arr; j++) {
                    int cmp = Integer.compare(arr1.get(j), arr2.get(j));
                    if (arr1.get(j) != arr2.get(j)) {
                        return cmp;
                    }
                }
                return Integer.compare(arr1.size(), arr2.size());
            });
            for (int j = 0; j < tmp.size(); j++) {
                for (int k = 0; k < tmp.get(j).size(); k++) {
                    System.out.print(tmp.get(j).get(k) + " ");
                }
                System.out.println();
            }
        }
    }

}