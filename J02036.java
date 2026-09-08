import java.util.Scanner;

public class J02036 {

    public static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static int bcnn(int x, int y){
        int tmp = gcd(x, y);
        return x / tmp * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            int[] ans = new int[n + 1];
            ans[0] = a[1];
            ans[n] = a[n];
            for(int i = 1; i <= n - 1; i++){
                ans[i] = bcnn(a[i], a[i + 1]);
            }
            for(int i = 0; i <= n; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
