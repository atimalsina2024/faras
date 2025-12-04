package faras.domain;

public enum Suit {
	
	HEART("Red"),
	DIAMOND("Red"),
	CLUB("Black"),
	SPADE("Black");
	
	private final String color;
	
	Suit(String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
