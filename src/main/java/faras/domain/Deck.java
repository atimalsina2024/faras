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
	
	public Card dealCard() {
		if(deckOfCards.isEmpty()) {
			throw new RuntimeException("Deck is empty");
		}
		else {
			Card drawnCard = deckOfCards.get(0);
			deckOfCards.remove(0);
			return drawnCard;
			
		}
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

}
