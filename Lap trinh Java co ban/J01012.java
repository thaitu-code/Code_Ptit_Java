import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<= t; i++){
            int n = sc.nextInt();
            int ans = 0;
            for(int j = 1; j * j <= n ; j++){
                if(n % j == 0){
                    if(j % 2 == 0) ans++;
                    if((n/j) % 2 == 0) ans++;
                    if(j == Math.sqrt(n) && j * j == n && j % 2 == 0) ans--;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
