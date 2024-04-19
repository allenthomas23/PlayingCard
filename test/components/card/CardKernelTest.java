package components.card;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.Card.Card;
import components.Card.Card1L;

public class CardKernelTest {

    @Test
    public void testGetValue() {
        Card card = new Card1L("A", "Spades", 1);
        assertEquals(1, card.getValue());
    }

    @Test
    public void testGetSuit() {
        Card card = new Card1L("A", "Spades", 1);
        assertEquals("Spades", card.getSuit());
    }

    @Test
    public void testGetRank() {
        Card card = new Card1L("A", "Spades", 1);
        assertEquals("A", card.getRank());
    }
    @Test
    public void testGetValueWithDifferentCard() {
        Card card = new Card1L("10", "Hearts", 10);
        assertEquals(10, card.getValue());
    }

    @Test
    public void testGetSuitWithDifferentCard() {
        Card card = new Card1L("K", "Clubs", 13);
        assertEquals("Clubs", card.getSuit());
    }

    @Test
    public void testGetRankWithDifferentCard() {
        Card card = new Card1L("Q", "Diamonds", 12);
        assertEquals("Q", card.getRank());
    }
}