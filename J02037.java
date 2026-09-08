import java.util.ArrayList;
import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            int cnt1 = 0, cnt2 = 0;
            for(int i = 0; i < a.length; i++){
                if(Integer.parseInt(a[i]) % 2 == 0){
                    cnt1++;
                }
                else cnt2++;
            }
            if((a.length % 2 == 0 && cnt1 > cnt2) || (a.length % 2 == 1 && cnt2 > cnt1)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }
}
