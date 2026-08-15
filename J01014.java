import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            long n = sc.nextLong();
            long ans = 1;
            for(int j = 2; j <= Math.sqrt(n); j++){
                while(n % j == 0){
                    ans = Math.max(ans, j);
                    n/=j;
                }

            }
            if(n > 1) ans = n;
            System.out.println(ans);
        }
    }
}
