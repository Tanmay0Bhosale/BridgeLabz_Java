package Strings.Level3;

// Class to simulate a deck of cards with shuffling and distribution
public class DeckOfCards {

    // Method to create a deck of cards using suits and ranks
    static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        // Loop to combine each suit with each rank
        for (String s : suits)
            for (String r : ranks)
                deck[index++] = r + " of " + s;

        return deck;
    }

    // Method to shuffle the deck randomly
    static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    // Method to distribute cards among players
    static void distribute(String[] deck, int players, int cards) {
        // Check if enough cards are available
        if (players * cards > deck.length) {
            System.out.println("Not possible");
            return;
        }

        int index = 0;

        // Loop to distribute cards to each player
        for (int p = 1; p <= players; p++) {
            System.out.println("Player " + p);
            for (int c = 0; c < cards; c++)
                System.out.println(deck[index++]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        // Initialize, shuffle, and distribute the deck
        String[] deck = initializeDeck(suits, ranks);
        shuffle(deck);
        distribute(deck, 4, 5);
    }
}
