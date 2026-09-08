import java.util.Scanner;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int ok = 0, i = 0;
            while(i < n){
                if(ok == 0){
                    for(int j = 0; j < n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                    ok = 1;
                }
                else{
                    for(int j = n - 1; j >= 0; j--){
                        System.out.print(a[i][j] + " ");
                    }
                    i++;
                    ok = 0;
                }
            }
            System.out.println();

        }
    }
}
