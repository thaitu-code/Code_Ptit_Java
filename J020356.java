import java.util.Scanner;

public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if(s == 0 && n == 1) {
            System.out.println("0 0");
        }
        else if (9 * n < s || (s == 0 && n != 1)) {
            System.out.println("-1 -1");
        } else {
            int tmp = n;
            int sum = s;
            StringBuilder s1 = new StringBuilder();
            while(tmp > 0){
                if(s > 9){
                    s1.append("9");
                    s-=9;
                }
                else{
                    if(tmp == 1){
                        s1.append(String.valueOf(s));
                        break;
                    }
                    s1.append(String.valueOf(s - 1));
                    tmp-=1;
                    if(tmp > 1){
                        while(tmp > 1){
                            s1.append("0");
                            tmp -= 1;
                        }
                        s1.append("1");
                        break;
                    }

                }
                tmp-=1;
            }
            s1.reverse();
            StringBuilder s2 = new StringBuilder();
            tmp = n;
            while(tmp > 0){
                if(sum > 9){
                    s2.append("9");
                    sum-=9;
                }
                else{
                    s2.append(String.valueOf(sum));
                    tmp-=1;
                    if(tmp > 0){
                        while(tmp > 0){
                            s2.append("0");
                            tmp -= 1;
                        }
                        break;
                    }
                }
                tmp-=1;
            }
            System.out.println(s1 + " " + s2);
        }

    }
}
