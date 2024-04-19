package components.Card;

import java.util.ArrayList;
import java.util.List;

public class CardUseCase2 {

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

        // Create a tower of cards
        List<List<Card>> tower = new ArrayList<>();
        int deckIndex = 0;
        for (int i = 0; i < 4; i++) {
            List<Card> level = new ArrayList<>();
            for (int j = 0; j < 13; j++) {
                level.add(deck.get(deckIndex++));
            }
            tower.add(level);
        }

        // Print the entire tower with the location of each card
        for (int i = 0; i < tower.size(); i++) {
            for (int j = 0; j < tower.get(i).size(); j++) {
                System.out.println("Level " + (i+1) + ", Position " + (j+1) + ": " + tower.get(i).get(j).getCardInfo());
            }
        }
    }
}