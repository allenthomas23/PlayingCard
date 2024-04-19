package components.card;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.Card.Card;
import components.Card.Card1L;

public class Card1LTest {

    @Test
    public void testCard1L() {
        // Create cards
        Card card1 = new Card1L("Ace", "Hearts", 1);
        Card card2 = new Card1L("King", "Spades", 10);

        // Test getters
        assertEquals("Ace", card1.getRank());
        assertEquals("Hearts", card1.getSuit());

        // Test card info
        assertEquals("Ace of Hearts", card1.getCardInfo());

        // Test isFaceCard and isAce
        assertFalse(card1.isFaceCard());
        assertTrue(card1.isAce());

        // Test isSameRank and isSameSuit
        assertFalse(card1.isSameRank(card2));
        assertFalse(card1.isSameSuit(card2));
    }
    @Test
public void testCard1LFaceCard() {
    // Create a face card
    Card card = new Card1L("King", "Diamonds", 10);

    // Test getters
    assertEquals("King", card.getRank());
    assertEquals("Diamonds", card.getSuit());

    // Test card info
    assertEquals("King of Diamonds", card.getCardInfo());

    // Test isFaceCard and isAce
    assertTrue(card.isFaceCard());
    assertFalse(card.isAce());

    // Test isSameRank and isSameSuit with a different card
    Card card2 = new Card1L("Queen", "Diamonds", 10);
    assertFalse(card.isSameRank(card2));
    assertTrue(card.isSameSuit(card2));
}

@Test
public void testCard1LNumberCard() {
    // Create a number card
    Card card = new Card1L("7", "Clubs", 7);

    // Test getters
    assertEquals("7", card.getRank());
    assertEquals("Clubs", card.getSuit());

    // Test card info
    assertEquals("7 of Clubs", card.getCardInfo());

    // Test isFaceCard and isAce
    assertFalse(card.isFaceCard());
    assertFalse(card.isAce());

    // Test isSameRank and isSameSuit with a different card
    Card card2 = new Card1L("7", "Hearts", 7);
    assertTrue(card.isSameRank(card2));
    assertFalse(card.isSameSuit(card2));
}
}