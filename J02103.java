import java.util.Scanner;

public class J02103 {
    public static void tichMaTran(int[][] a1, int n, int m, int t){
        System.out.println("Test " + t + ":");
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int ans = 0;
                for(int p = 0; p < m; p++){
                    ans += a1[i][p] * a1[j][p];
                }
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), cnt = 1;
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            tichMaTran(a, n, m, cnt);
            cnt+=1;
        }
    }
}
