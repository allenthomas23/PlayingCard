package components.Card;

/**
 * {@code card} enhanced with secondary methods.
 */
public interface Card extends Comparable<Card>, CardKernel {


    /**
     * Gets the information of the card.
     *
     * @return the information of the card
     * @ensures getCardInfo = this
     */
    String getCardInfo();

    /**
     * Checks if the card is a face card.
     *
     * @return true iff the card is a face card
     * @ensures isFaceCard = (rank is "Jack" or rank is "Queen" or rank is "King")
     */
    boolean isFaceCard();

    /**
     * Checks if the card is an Ace.
     *
     * @return true iff the card is an Ace
     * @ensures isAce = (rank is "Ace")
     */
    boolean isAce();

    /**
     * Checks if two cards have the same rank.
     *
     * @param otherCard the other card to compare
     * @return true iff the cards have the same rank
     * @ensures isSameRank = (this.rank equals otherCard.rank)
     */
    boolean isSameRank(Card otherCard);

    /**
     * Checks if two cards have the same suit.
     *
     * @param otherCard the other card to compare
     * @return true iff the cards have the same suit
     * @ensures isSameSuit = (this.suit equals otherCard.suit)
     */
    boolean isSameSuit(Card otherCard);

    /**
     * Checks if two cards are the same.
     *
     * @param otherCard the other card to compare
     * @return true iff the cards are the same
     * @ensures isSameCard = (isSameRank(otherCard) and isSameSuit(otherCard))
     */
    boolean isSameCard(Card otherCard);

    /**
     * Checks if the card is a low card (2 to 6).
     *
     * @return true if the card is a low card, false otherwise
     * @ensures isLowCard = (getValue() >= 2 && getValue() <= 6)
     */
    public boolean isLowCard();



    /**
     * Checks if the card is a high card (10 or higher, or face card, or Ace).
     *
     * @return true if the card is a high card, false otherwise
     * @ensures isHighCard = (getValue() >= 10 || isFaceCard() || isAce())
     */
    public boolean isHighCard() ;
    /**
     * Checks if the card is red (Hearts or Diamonds).
     *
     * @return true if the card is red, false otherwise
     * @ensures isRed = (suit.equals("Hearts") || suit.equals("Diamonds"))
     */
    public boolean isRed() ;

    /**
     * Checks if the card is black (Spades or Clubs).
     *
     * @return true if the card is black, false otherwise
     * @ensures isBlack = (suit.equals("Spades") || suit.equals("Clubs"))
     */
    public boolean isBlack() ;

}