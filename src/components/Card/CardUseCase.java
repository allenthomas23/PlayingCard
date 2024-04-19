package components.Card;

import java.util.ArrayList;
import java.util.List;

public class CardUseCase {

    public static void main(String[] args) {
        // Create a new deck
        List<Card> deck = new ArrayList<>();
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                deck.add(new Card1L(ranks[i], suit, i+1));
            }
        }

        // Print the entire deck
        for (Card card : deck) {
            System.out.println(card.getCardInfo());
        }
    }
}