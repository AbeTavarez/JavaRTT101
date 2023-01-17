package section20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("section20/script.txt");
            Scanner scan = new Scanner(file);
            System.out.println(scan.nextLine());
            scan.close();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Completed...");
        }
    }
}
