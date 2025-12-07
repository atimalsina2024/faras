package faras.domain;

import java.util.ArrayList;
import java.util.List;

public class Deal {
	
	private  Deck deck;
	private List<Player> players;
	
	public Deal(Deck deck, List<Player> players) {
		this.deck = deck;
		this.players = players;
	}
	
	/**
	 * deals cards to players for faras game by calling helper methods;
	 */
	public void dealFaras() {
		deck = new Deck();
		deck.shuffleDeck();
		List<Card> cardsToDistribute = collectCardsToDeal(players.size(), "faras");
		dealCard(cardsToDistribute);
		
	}
	
	/**
	 * distributes cards equally among players
	 * */
	private void dealCard(List<Card> cardsToDistribute) {
		if(cardsToDistribute.isEmpty()) {
			throw new RuntimeException("No Cards on deck to deal");
		}
		else {
			int playerIndex=0;
			int playerCount=players.size();
			
			for(Player player: players) {
				List<Card> tempCards = new ArrayList<>();
				for(int i=playerIndex; i<cardsToDistribute.size(); i+=playerCount) {
					tempCards.add(cardsToDistribute.get(i));
				}
				player.setCardOnHand(tempCards.toArray(size -> new Card[size]));
				playerIndex ++;
			}
			
		}
	}
	/**
	 * This function takes number of players, and what game to deal cards for. Returns total number of cards that needs to be distributed to each 
	 * players
	 * Example for faras each player gets 3 cards each. If there are 3 players in a game So this method returns first 3*3=9 cards from the deck;
	 */
	
	private List<Card> collectCardsToDeal(int numOfPlayers, String game){
		switch (game.toLowerCase()) {
		case "faras":
			List<Card> cardsToDistribute = new ArrayList<>();
			for(int i=0; i<numOfPlayers*3; i++) {
				cardsToDistribute.add(deck.getDeckOfCards().get(i));
				deck.getDeckOfCards().remove(i);
			}
			return cardsToDistribute;
		default:
			cardsToDistribute=null;
			throw new RuntimeException("Invalid Game selection");
		}
	}
}
