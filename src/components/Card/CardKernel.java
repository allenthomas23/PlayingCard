package components.Card;

import components.standard.Standard;

/**
 * Card kernel component with primary methods. (Note: by package-wide
 * convention, all references are non-null.)
 *
 * @mathsubtypes <pre>
 * CARD is modeled by a pair of strings (suit, rank)
 * exemplar c
 * </pre>
 * @mathmodel type CardKernel is modeled by CARD
 * @initially <pre>
 * (String suit, String rank):
 *  requires
 *   validSuit(suit) and validRank(rank)
 *  ensures
 *   this = (suit, rank)
 * </pre>
 */
public interface CardKernel extends Standard<Card> {



    /**
     * Gets the suit of the card.
     *
     * @return the suit of the card
     * @ensures this = this
     */
    String getSuit();

    /**
     * Gets the rank of the card.
     *
     * @return the rank of the card
     * @ensures this = this
     */
    String getRank();

    /**
     * Gets the value of the card.
     *
     * @return the value of the card
     * @ensures this = this
     * value is 1-10
     */
    int getValue();


}
