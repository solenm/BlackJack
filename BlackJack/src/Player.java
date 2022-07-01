
public class Player {
	/**
	 * The players hand
	 */
	private Hand hand;
	
	/**
	 * Instantiates the hand instance variable.
	 */
	public Player() {
		hand= new Hand();
	}
	
	
	/**
	 * @return the player's hand
	 */
	public Hand getHand() {
		return hand;
	}

}
