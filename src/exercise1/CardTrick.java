package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 
 * @author NamanSidana May 26, 2023 
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        Random random = new Random();

        int value = random.nextInt(13) + 1;

        System.out.print("Enter card value (1-10, 11 for jack, 12 for queen, and 13 for king): ");
        Scanner scanner = new Scanner(System.in);
        int userValue = scanner.nextInt();

        System.out.print("Enter card suit (1 for hearts, 2 for diamonds, 3 for clubs, and 4 for spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card(userValue, userSuit);
        Card randomCard = new Card(value, random.nextInt(4));

        if (userCard.equals(randomCard)) {
            System.out.println("Congratulations! You have a match.");
            randomCard.printInfo();
        } else {
            System.out.println("No match found.");
        }
    }


    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
