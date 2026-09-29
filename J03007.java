import java.util.Scanner;

public class J03007 {

    public static boolean check1(String tmp){
        StringBuilder sb = new StringBuilder(tmp);
        StringBuilder reverseSb = sb.reverse();
//        System.out.println(reverseSb + " " + tmp);
        if(reverseSb.toString().equals(tmp)){
            return true;
        }
//        System.out.println("he");
        return false;
    }
    public static boolean check2(String tmp){
        if(tmp.charAt(0) == '8' && tmp.charAt(tmp.length() - 1) == '8'){
            return true;
        }

        return false;
    }
    public static boolean check3(String tmp){
        int sum = 0;
        for(int i= 0; i < tmp.length(); i++){
            sum += tmp.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s) && check2(s) && check3(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
