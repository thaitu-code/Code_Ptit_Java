import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans = 0;
        for(int i = 1; i<= t; i++){
            int n = sc.nextInt();
            if(n == 1){
                ans+=1;
                continue;
            }
            for(int j = 2; j <= Math.sqrt(n) ; j++){
                while(n % j == 0){
                    ans += j;
                    n/=j;
                }
            }
            if(n > 1) ans+=n;

        }
        System.out.print(ans);
        sc.close();
    }
}
