package components.Card;

/**
 * Layered implementations of secondary methods for {@code Card}.
 */
public abstract class CardSecondary implements Card {


    public String getCardInfo(){
        return this.getRank() + " of " + this.getSuit() + "With value " + this.getValue();
    }


    public boolean isFaceCard(){
        return this.getRank().equals("Jack") || this.getRank().equals("Queen") || this.getRank().equals("King");
    }


    public boolean isAce(){
        return this.getRank().equals("Ace");
    }


    public boolean isSameRank(Card otherCard){
        return this.getRank().equals(otherCard.getRank());
    }


    public boolean isSameSuit(Card otherCard){
        return this.getSuit().equals(otherCard.getSuit());
    }


    public boolean isSameCard(Card otherCard){
        return this.isSameRank(otherCard) && this.isSameSuit(otherCard);
    }

    public boolean isLowCard() {
        return this.getValue() >= 2 && this.getValue() <= 6;
    }


    public boolean isHighCard() {
        return this.getValue() >= 10 || this.getRank().equals("Jack") || this.getRank().equals("Queen") || this.getRank().equals("King") || this.getRank().equals("Ace");
    }


    public boolean isRed() {
        return this.getSuit().equals("Hearts") || this.getSuit().equals("Diamonds");
    }


    public boolean isBlack() {
        return this.getSuit().equals("Spades") || this.getSuit().equals("Clubs");
    }
 }