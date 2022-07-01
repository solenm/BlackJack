
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
