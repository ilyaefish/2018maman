package Mamn11Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
	// private Card deck[]; // array of Card objects

	private int currentCard; // index of next Card to be dealt




	private final int NUMBER_OF_CARDS = 52; // constant number of Cards
	private ArrayList<Card> deck = new ArrayList<Card>();
	private Random randomNumbers; // random number generator
	// This arrays were moved outside of the constructor so both constructors
	// could us it
	String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
			"King" };
	String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

	// constructor fills deck of Cards
	public DeckOfCards() {

		// deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
		currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
		randomNumbers = new Random(); // create random number generator

		// populate deck with Card objects
		for (int count = 0; count < NUMBER_OF_CARDS; count++)
			deck.add(count, new Card(faces[count % 13], suits[count / 13]));
		// deck[count] = new Card(faces[count % 13], suits[count / 13]);
	} // end DeckOfCards constructor

	// This constructor will be useful creating empty Deck
	public DeckOfCards(String st) {
		currentCard = 0;
		if (st.equals("Empty"))
			;
		{

		}

	}
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < this.deck.size(); i++) {
			st.append(this.deck.get(i).getSuit() + "-" + this.deck.get(i).getFace() + "; ");

		}
		
		return st.toString();
	}

	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		// after shuffling, dealing should start at deck[ 0 ] again
		currentCard = 0; // reinitialize currentCard

		// for each Card, pick another random Card and swap them
		for (int first = 0; first < deck.size(); first++) {
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			// swap current Card with randomly selected Card
			Collections.swap(deck, first, second);
			// OLD
			// Card temp = deck[first];
			// deck[first] = deck[second];
			// deck[second] = temp;
		} // end for
	} // end method shuffle

	// deal one Card
	public Card dealCard() {
		// determine whether Cards remain to be dealt
		if (currentCard < deck.size())
			return deck.get(currentCard++);
		// return deck[currentCard++]; // return current Card in array
		else
			return null; // return null to indicate that all Cards were dealt
	} // end method dealCard

	public int size() {
		return this.deck.size();
	}

	/**
	 * 
	 */

	public void add(Card dealCard) {
		this.deck.add(dealCard);

	}

	public Card get(int i) {
		// TODO Auto-generated method stub
		return this.deck.get(i);
	}

} // end class DeckOfCards
