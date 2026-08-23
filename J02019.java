import java.util.Scanner;

public class J02019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        int[] sang = new int[1000003];
        for (int i = 1; i <= 1000000; i++)
            sang[i] = 0;
        for (int i = 1; i <= 1000000 / 2; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                sang[j] += i;
            }
        }
        for (int i = a; i <= b; i++) {
            if (sang[i] > i) {
                // System.out.println(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
