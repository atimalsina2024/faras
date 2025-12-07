package faras.domain;

public class Player {
	
	private final String name;
	private final Card[] cardsOnHand;
	
	public Player(String name) {
		this.name = name;
		cardsOnHand = new Card[3];
	}
	
	public String getPlayerName() {
		return name;
	}
	
	public void setCardOnHand(Card[]cards) {
		for(int i=0; i<cards.length; i++) {
			cardsOnHand[i] = cards[i];
		}
	}
	
	public Card[] getCardsOnHand() {
		return this.cardsOnHand;
	}
	
	@Override
	public String toString() {
		StringBuilder cards = new StringBuilder();
		for(Card card : cardsOnHand) {
			cards.append(card.getRank().toString() + " of " + card.getSuit().toString() +"\n");
		}
		return cards.toString();
	}

}
