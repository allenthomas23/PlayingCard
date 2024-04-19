package components.Card;


public class CardProof {
    private String suit;
    private String rank;
    private int value;

    public CardProof(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public static void main(String[] args) {
        // Creating a playing card
        CardProof card1 = new CardProof("Hearts", "King",10);

        // Displaying card information
        System.out.println("Card Info: " + card1.getCardInfo());

        // Checking if it's a face card or an Ace
        System.out.println("Is Face Card? " + card1.isFaceCard());
        System.out.println("Is Ace? " + card1.isAce());

        // Creating another playing card
        CardProof card2 = new CardProof("Spades", "Jack",10);

        // Comparing ranks and suits
        System.out.println("Same Rank? " + card1.isSameRank(card2));
        System.out.println("Same Suit? " + card1.isSameSuit(card2));
        System.out.println("Same Card? " + card1.isSameCard(card2));


    }


    //kernal methods
    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    public int getValue() {
        return this.value;
    }

    // Secondary Methods
    public String getCardInfo() {
        return this.rank + " of " + this.suit + "With value " + this.value;
    }

    public boolean isSameRank(CardProof otherCard) {
        return this.rank.equals(otherCard.getRank());
    }

    public boolean isSameSuit(CardProof otherCard) {
        return this.suit.equals(otherCard.getSuit());
    }

    public boolean isSameCard(CardProof otherCard) {
        return this.isSameRank(otherCard) && this.isSameSuit(otherCard);
    }

    public boolean isFaceCard() {
        return this.rank.equals("Jack") || this.rank.equals("Queen") || this.rank.equals("King");
    }

    public boolean isAce() {
        return this.rank.equals("Ace");
    }

    public boolean isLowCard() {
        return this.getValue() >= 2 && this.getValue() <= 6;
      }

      public boolean isHighCard() {
        return this.getValue() >= 10 || this.rank.equals("Jack") || this.rank.equals("Queen") || this.rank.equals("King") || this.rank.equals("Ace");
      }

      public boolean isRed() {
        return this.suit.equals("Hearts") || this.suit.equals("Diamonds");
      }

      public boolean isBlack() {
        return this.suit.equals("Spades") || this.suit.equals("Clubs");
    }
}
