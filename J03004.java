import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String[] s = sc.nextLine().trim().split("\\s+");

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length; i++){
//                System.out.println(s[i]);
                sb = new StringBuilder(s[i]);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                for(int j = 1; j < sb.length(); j++){
                    sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
                }
                System.out.print(sb + " ");
            }
            System.out.println();
        }


    }
}
