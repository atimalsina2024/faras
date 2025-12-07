package faras.domain;

public enum Suit {
	
	HEART("Red", "Heart"),
	DIAMOND("Red", "Diamond"),
	CLUB("Black", "Club"),
	SPADE("Black", "Spade");
	
	private final String color;
	private final String suit;
	
	Suit(String color, String suit){
		this.color = color;
		this.suit = suit;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	@Override
	public String toString() {
		return suit;
	}
}
