import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String tmp = sc.nextLine();
                System.out.println(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file Hello.txt");
        }
    }
}
