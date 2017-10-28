package Mamn11Q2;


public class Card {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [face=" + face + ", suit=" + suit + "]";
	}

	/**
	 * @return the face
	 */
	public String getFace() {
		return face;
	}

	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	private final String face; // face of card ("Ace", "Deuce", ...)
	private final String suit; // suit of card ("Hearts", "Diamonds", ...)

	// two-argument constructor initializes card's face and suit
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // initialize face of card
		this.suit = cardSuit; // initialize suit of card
	}

}// end class Card
