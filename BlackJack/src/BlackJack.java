
public class BlackJack {
	
	private Deck deck;
	private Dealer dealer;
	private Player player;

	public BlackJack() {
		//class objects
		deck= new Deck();
		dealer= new Dealer();
		player= new Player();
		//shuffle
		deck.shuffle();
		//player & dealer hands
		player.getHand().addCard(deck.draw());
		player.getHand().addCard(deck.draw());
		dealer.getHand().addCard(deck.draw());
		dealer.getHand().addCard(deck.draw());

	}
	
	/**
	 * Returns the value of a card in a standard game of Blackjack based on the type of the card
	 * ex. An Ace would return 1, a 2 would return 2... 
	 * @param c card whose value is extracted
	 * @return value of the card
	 */
	public static int getValueOfCard(Card c) {
		//if and else if statements for card values 
		if(Card.Type.ACE == c.getType())
		{
			return 1;
		}
		else if(Card.Type.TWO == c.getType())
		{
			return 2;
		}
		else if(Card.Type.THREE == c.getType())
		{
			return 3;
		}
		else if(Card.Type.FOUR == c.getType())
		{
			return 4;
		}
		else if(Card.Type.FIVE == c.getType())
		{
			return 5;
		}
		else if(Card.Type.SIX == c.getType())
		{
			return 6;
		}
		else if(Card.Type.SEVEN == c.getType())
		{
			return 7;
		}
		else if(Card.Type.EIGHT == c.getType())
		{
			return 8;
		}
		else if(Card.Type.NINE == c.getType())
		{
			return 9;
		}
		else
		{
			return 10;
		}
		
		
	}
	
	/**
	 * @return Deck used to play
	 */
	public Deck getDeck() {
		return deck;
	}
	
	/**
	 * @return Dealer of the game
	 */
	public Dealer getDealer() {
		return dealer;
	}
	
	/**
	 * @return Player playing the blackjack game
	 */
	public Player getPlayer() {
		return player;
	}
}
