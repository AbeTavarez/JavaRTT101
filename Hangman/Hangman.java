package Hangman;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static String getRandomWord () {
        int randomNumber = (int) Math.floor(Math.random() * words.length);
        // System.out.println(randomNumber);
        String randomWord = words[randomNumber];
        System.out.println(randomWord);
        return randomWord;
    }

    public static String[] getPlaceholders(String randomWord) {
        String[] placeholders = new String[randomWord.length()];
    
        // populates array with number of dashes
        for (int i = 0; i < randomWord.length(); i++) {
            placeholders[i] = "-";
        }
        
        return placeholders;
    }

    public static void checkMatch(String guess) {

    } 

    public static void printPlaceholder(String[] placeholders){
        // Print the dashes for random word
    System.out.print("Word: ");
    for (int i = 0; i < placeholders.length; i++) {
        System.out.print(placeholders[i]);
    }
    }

    public static void main(String[] args) {
    // we get a random word
    String randomWord = getRandomWord();
    // we create the placeholders for the word
    String[] placeholders = getPlaceholders(randomWord);
    // we create an array to store the guessed letters
    String[] randomWordArray = randomWord.split("");
    int numberOfGuesses = 0;
    int missedGuesses = 0;
    // print placeholder lines
    printPlaceholder(placeholders);

    // Create scanner and prompt user
    Scanner scan = new Scanner(System.in);
    
    // Prompt user
    for (int i = 0; i <= 6; i++) {
        System.out.println("\nEnter a single letter:");
        String guess = scan.nextLine();
        guess.trim();
        System.out.println("Your guess is: " + guess + "\n"); 
        numberOfGuesses++;
        Boolean gotMatched = null;

        // Check if the letter is in the word
        for (int j = 0; j < randomWordArray.length; j++) {
            if (guess.equals(randomWordArray[j])) {
                placeholders[j] = randomWordArray[j];
                printPlaceholder(placeholders);System.out.println("\n");
                gotMatched = true;
            } 
        }

        // check if letter is not in the word
        if (gotMatched == null) {
            System.out.println("Letter not in word \n");
            missedGuesses++;
            // gotMatched = false;
        }
        
        String concat = String.join("", placeholders);
        // check if user guessed all letters
        if (randomWord.equals(concat)) {
            System.out.println("\nYou guessed all letters!\n");
            System.out.println("You missed " + missedGuesses + " guesses.\n");
            System.out.println("The word was: " + randomWord + "\n");
            break;
        }
    }



    }

}





