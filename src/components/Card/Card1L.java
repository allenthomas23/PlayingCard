package components.Card;

/**
 * {@code Card} represented with String values for rank and suit with implementations of primary methods.
 *
 * @representation the rank and suit must not be null
 * @convention rank and suit are non-null String values representing the rank and suit of the card, respectively
 * @correspondence this = (rank, suit)
 */

public class Card1L extends CardSecondary {
    private String suit;
    private String rank;
    private int value;

    private void createNewRep() {
        this.rank = "Ace";
        this.suit = "Hearts";
        this.value = 1;
    }
    /*
    * Constructors -----------------------------------------------------------
    */

    /**
     * No-argument constructor.
     */
    public Card1L() {
        this.createNewRep();
    }
    /**
     * Constructs a card with the specified rank and suit.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     * @param value the value of the card
     */
    public Card1L(String rank, String suit,int value) {
        assert rank != null && suit != null : "Violation of: rank and suit are not null";
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }
    /*
     * Standard methods -------------------------------------------------------
     */

    public final Card newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }


    public final void clear() {
        this.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    public final String getSuit(){
        return this.suit;
    }
    public final String getRank(){
        return this.rank;
    }
    public final int getValue(){
        return this.value;
    }

    @Override
    public int compareTo(Card o) {

        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public void transferFrom(Card source) {
        assert source != null : "Violation of: source is not null";
        assert source instanceof Card : "" + "Violation of: source is of dynamic type Tree1<?>";
        Card1L localSource = (Card1L) source;
        this.rank = localSource.getRank();
        this.suit = localSource.getSuit();
        this.value = localSource.getValue();

        localSource.createNewRep();
        throw new UnsupportedOperationException("Unimplemented method 'transferFrom'");
    }
 }