package faras.domain.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import faras.domain.Card;
import faras.domain.Rank;
import faras.domain.Suit;

public class CardTest {
	
	@Test
	public void Test_Card_Creation() {	
		Card card = new Card(Suit.SPADE, Rank.ACE);
		assertEquals(card.getSuit(), Suit.SPADE);
		assertEquals(card.getRank(), Rank.ACE, "Card Creation Failed");
	}
	
	@Test
	public void Test_Different_Suit_Same_Rank() {
		Card card1 = new Card(Suit.HEART, Rank.TWO);
		Card card2 = new Card(Suit.CLUB, Rank.TWO);
		assertEquals(card1.getRank(), card2.getRank(),"Same Rank different suite cards are not equal");
		
	}
	
	@Test
	public void Test_Different_Rank() {
		Card card1 = new Card(Suit.HEART, Rank.TWO);
		Card card2 = new Card(Suit.CLUB, Rank.FIVE);
		assertNotEquals(card1.getRank(), card2.getRank(), "Different rank cards are equal");
	}
	
	@Test
	public void Test_Ace_Greater_Than_King() {
		Card card1 = new Card(Suit.HEART, Rank.ACE);
		Card card2 = new Card(Suit.CLUB, Rank.KING);
		assertTrue(card1.getRank().getValue() > card2.getRank().getValue(),"Ace is smaller in value than King");
	}

}
