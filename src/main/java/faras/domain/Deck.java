package faras.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private final List<Card> deckOfCards = new ArrayList<>();
	
	public Deck() {
		buildNewDeck();
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deckOfCards);
	}
	
	public void resetDeck() {
		buildNewDeck();
		shuffleDeck();
	}
	
	private void buildNewDeck() {
		if(!deckOfCards.isEmpty()) {
			deckOfCards.clear();
		}
		for(Suit suit: Suit.values()) {
			for(Rank rank: Rank.values()) {
				deckOfCards.add(new Card(suit, rank));
			}
		}
	}
	
	public int getRemainingCardsOnDeck() {
		return this.deckOfCards.size();
	}
	public List<Card> getDeckOfCards(){
		return this.deckOfCards;
	}


}
