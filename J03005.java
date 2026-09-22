import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String[] s = sc.nextLine().trim().split("\\s+");

            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < s.length; i++){
//                System.out.println(s[i]);
                sb = new StringBuilder(s[i]);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                for(int j = 1; j < sb.length(); j++){
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
                if(i != s.length - 1){
                    System.out.print(sb + " ");
                }
                else{
                    System.out.print(sb + ", ");
                }
            }
            sb = new StringBuilder(s[0]);
            for(int i = 0; i < sb.length(); i++){
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

            }
            System.out.println(sb);
            System.out.println();
        }


    }
}
