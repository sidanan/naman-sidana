package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that randomly generates a hand of 7 cards and asks the user to pick a card.
 * It then searches the array of cards for a match to the user's card.
 * To be used as starting code in Exercise.
 * 
 * @author naman Sidana (May 26, 2023)
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random random = new Random();

        // Generate a random hand of cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (1-4): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        // Search for a match in the hand of cards
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                matchFound = true;
                break;
            }
        }

        // Print the result
        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
    }

    /**
     * Prints information about the matching card.
     */
    public static void printInfo() {
        // Add implementation here to print card information
    }
}

    //Naman Sidana May 26 2023
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
