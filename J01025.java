import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int minX = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int maxX = Math.max(Math.max(x1, x2), Math.max(x3, x4));

        int minY = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int maxY = Math.max(Math.max(y1, y2), Math.max(y3, y4));

        int width = maxX - minX;
        int height = maxY - minY;

        long side = Math.max(width, height);

        long area = side * side;
        System.out.println(area);
    }
}