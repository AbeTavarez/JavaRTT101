package section3;

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println("Select option 'a' to buy a car");
        System.out.println("Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What's your budget?");
                int budget = scan.nextInt();
                if (budget >= 10_000) {
                    System.out.println("Great! We have the perfect car for you");
                    System.out.println("\nDo you have insurance? (yes or no)");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("Do you have a driver license? (yes or no)");
                    String license = scan.nextLine();
                    System.out.println("What's your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equalsIgnoreCase("yes") && license.equalsIgnoreCase("yes")) {
                        System.out.println("Sold! Pleasure doing business with you!");
                    } else {
                        System.out.println("We're sorry, you are not eligible.");
                    }

                } else {
                    System.out.println("Sorry we don't sale cars under 10,000");
                }
                break;
            case "b":
                System.out.println("\nWhat's your car value at?");
                int carValue = scan.nextInt();
                System.out.println("\nWhat's your selling price?");
                int sellingPrice = scan.nextInt();

                if(carValue > sellingPrice && sellingPrice < 30000) {
                    System.out.println("\nWe will buy your car!");
                } else {
                    System.out.println("\nSorry, we're not interested!");
                }

                break;
            default:
                System.out.println("Invalid options");
                break;
        }
        scan.close();
    }
}
