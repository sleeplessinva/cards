
public class TestDeck {

	public static void main (String[] arg) {
		Deck mydeck = new Deck();
		mydeck.showDeck();
		
		mydeck = null;
		
		if (mydeck == null) {
			System.out.println("The deck is empty!");
		}
		
	}
}
