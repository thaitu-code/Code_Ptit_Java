import java.util.Scanner;

public class J03008 {

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
        for(int i = 0; i < tmp.length(); i++){
            if(tmp.charAt(i) != '2' && tmp.charAt(i) != '3' && tmp.charAt(i) != '5' && tmp.charAt(i) != '7'){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check1(s) && check2(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
