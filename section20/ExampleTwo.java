package section20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        // we need to handle the readFile method here
        try {
            readFile("section20/script.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }

    // we can mark a method that throws an FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
        scan.close();
    } {

    }
}
