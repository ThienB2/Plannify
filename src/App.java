import java.io.FileInputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        FileInputStream fis = new FileInputStream("src/test.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
