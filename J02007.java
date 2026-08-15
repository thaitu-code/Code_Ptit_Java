import java.util.LinkedHashMap;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.println("Test " + i + ":");
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (map.containsKey(x)) {
                    map.replace(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
            for (Integer x : map.keySet()) {
                System.out.println(x + " xuat hien " + map.get(x) + " lan");
            }
        }
        sc.close();
    }
}
