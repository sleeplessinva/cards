
public class Deck {

	private Card[]	deck;
	private int 	MAXCARDS;
	
	public Deck () {
		
		MAXCARDS = 52;
		
		int i;
		i = 0;
		
		deck = new Card[MAXCARDS];
	
		// initialize the deck with cards
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				if (i < MAXCARDS) {
					deck[i++] = new Card(suit, rank);
				}
			}
		}
	}
	
	// print out the deck
	public void showDeck() {
		for (int i=0; i < MAXCARDS; i++)
			System.out.println(deck[i].getSuit().toString() + " of " + deck[i].getRank().toString());
	}
}
