import java.util.Arrays;
import java.util.Scanner;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        int [][] maxtrix_a = new int[n][n];
        for(int i = 0; i < n * n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int n1 =0, n2 = n - 1, n3 = 0, n4 = n - 1;
        int i = 0;
//        System.out.println(n * n);
        while(i < n * n){
            for(int j = n1; j <= n2; j++){
                maxtrix_a[n3][j] = a[i++];
            }
            n3++;
            for(int j = n3; j <= n4; j++){
                maxtrix_a[j][n2] = a[i++];
            }
            n2--;
            if(n1 <= n2){
                for(int j = n2; j >= n1; j--){
                    maxtrix_a[n4][j] = a[i++];
                }
                n4--;
            }
            if(n3 <= n4){
                for(int j = n4; j >= n3; j--){
                    maxtrix_a[j][n1] = a[i++];
                }
                n1++;
            }
        }
        for(i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(maxtrix_a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
