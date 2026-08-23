import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> arr = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (arr.empty()) {
                arr.push(x);
            } else {
                if ((arr.peek() + x) % 2 == 0) {
                    arr.pop();
                } else
                    arr.push(x);
            }
        }
        System.out.println(arr.size());

    }
}
