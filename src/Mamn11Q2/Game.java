package Mamn11Q2;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Game {
	//
	static Map<String, Integer> valueMap = new HashMap<String, Integer>();
	static {
		valueMap.put("Ace", 11);
		valueMap.put("Deuce", 2);
		valueMap.put("Three", 3);
		valueMap.put("Four", 4);
		valueMap.put("Five", 5);
		valueMap.put("Six", 6);
		valueMap.put("Seven", 7);
		valueMap.put("Eight", 8);
		valueMap.put("Nine", 9);
		valueMap.put("Ten", 10);
		valueMap.put("Jack", 10);
		valueMap.put("Queen", 10);
		valueMap.put("King", 10);
	}
	final static int WINING_NUMBER = 21;
	// execute application
	public static void main(String args[]) {
		; // constant number of wining valuew

		DeckOfCards myDeckOfCards1 = new DeckOfCards();
		myDeckOfCards1.shuffle(); // place Cards in random order

		
		int playing = 0;
		int reply = JOptionPane.showConfirmDialog(null, "Do you want to Play 21 Game?", "CardGame",
				JOptionPane.YES_NO_OPTION);
		if (reply == JOptionPane.YES_OPTION) {
		while(playing ==0){


			DeckOfCards myDeckOfCards = new DeckOfCards();
			myDeckOfCards.shuffle();
			DeckOfCards playerDeck = new DeckOfCards("Empty");
			DeckOfCards computerDeck = new DeckOfCards("Empty");
			playerDeck.add(myDeckOfCards.dealCard());
			computerDeck.add(myDeckOfCards.dealCard());

			boolean more_cards = true;

			while (more_cards) {
				if (valueOfDeck(computerDeck) < 15)
					computerDeck.add(myDeckOfCards.dealCard());

				int reply2 = JOptionPane.showConfirmDialog(null,
						"Your Cards are: " + playerDeck + "\nDo you want another card?", "Runing Gmae",
						JOptionPane.YES_NO_OPTION);
				if (reply2 == JOptionPane.YES_OPTION) {
					playerDeck.add(myDeckOfCards.dealCard());
				} else {
					more_cards = false;
				}
			}
			;
			playing = winner_Announcement(playerDeck, computerDeck);

		}
		}
		else {
			JOptionPane.showMessageDialog(null, "GOODBYE");
			System.exit(0);
		}
		
		
	}// end main

	private static int winner_Announcement(DeckOfCards playerDeck, DeckOfCards computerDeck) {
		String winner = "";
		int player_value = valueOfDeck(playerDeck);
		int computer_value = valueOfDeck(computerDeck);
		if (player_value > WINING_NUMBER && computer_value > WINING_NUMBER) {
			winner = "Duece";
		} else if (player_value <= WINING_NUMBER && computer_value > WINING_NUMBER) {
			winner = "You Won! :)";
		} else if (player_value > WINING_NUMBER && computer_value <= WINING_NUMBER)
			winner = "Computer Won :(";
		else if (player_value == computer_value)
			winner = "Duece";
		else if (player_value > computer_value)
			winner = "You Won! :)";
		else
			winner = "Computer Won :(";
		
		
		JOptionPane.showMessageDialog(null, "Your Cards: " + playerDeck + " Value of: " + player_value
				+ "\nComputer Cards: " + computerDeck + " Value of: " + computer_value + "\n" + winner);
		int reply3 = JOptionPane.showConfirmDialog(null, "Do to Playanother Game?", "CardGame",
				JOptionPane.YES_NO_OPTION);
		if (reply3 == JOptionPane.YES_OPTION) {
			return reply3;
		}
		else{
			JOptionPane.showMessageDialog(null, "GOODBYE");
			System.exit(0);
			return 0;
			
		}

	}

	public static int valueOfDeck(DeckOfCards player_deck) {
		int NumeOfAces = 0;
		int value = 0;
		for (int i = 0; i < player_deck.size(); i++) {

			String cardName = player_deck.get(i).getFace();
			if (cardName.equals("Ace"))
				NumeOfAces++;

			int val = valueMap.get(cardName);
			value += val;
		}
		// check if the value can be manipulated because of Aces existence
		// every iteration this method will try to change the value of Ace to
		// from 11 to 1 and will check value has less then 22
		if (value > 21 && NumeOfAces > 0)
			;
		{
			while (value > 21 && NumeOfAces > 0) {
				NumeOfAces--;
				value -= 10;
			}

		}
		return value;

	}
}// end Game
