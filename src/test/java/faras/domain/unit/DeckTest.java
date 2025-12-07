package faras.domain.unit;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import faras.domain.Card;
import faras.domain.Deck;
import faras.domain.Suit;

public class DeckTest {
	
	
	@Test
	public void testNewDeckHas52Cards() {
		Deck deck = new Deck();
		assertTrue(deck.getDeckOfCards().size() == 52, "Total cards in deck are not 52");
	}
	
	@Test
	public void testSuitHas13Cards() {
		Deck deck = new Deck();
		assertTrue(deck.getDeckOfCards().stream()
		.filter(card -> card.getSuit() == Suit.HEART)
		.collect(Collectors.toList())
		.size() == 13);

	}
	
	@Test
	public void testDeckHas52UniqueCards() {
		Deck deck = new Deck();
		assertTrue(new HashSet<Card>(deck.getDeckOfCards()).size() == 52, "Cards in deck are not unique");
	}
	
	@Test
	public void testShuffleChangesTheOrder() {
		Deck deck = new Deck();
		List<Card> deckBeforeShuffle = new ArrayList<>(deck.getDeckOfCards());
		deck.shuffleDeck();
		List<Card> deckAfterShuffle = new ArrayList<>(deck.getDeckOfCards());
		assertFalse(deckBeforeShuffle.equals(deckAfterShuffle));
	}

}
