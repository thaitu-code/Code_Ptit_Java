import java.util.Scanner;

public class J01011 {
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            long a = sc.nextInt(), b = sc.nextInt();
            long ans = gcd(a, b);
            System.out.println(a*b/ans + " " + ans);
        }
    }
}
