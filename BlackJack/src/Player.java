
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
	 * @return true if the player has bused
	 */
	public boolean busted() {
		if(BlackJack.getValueOfHand(hand) > 21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * empty the player hand into the cards
	 * @param d deck that receives the cards
	 */
	public void returnCardstoDeck(Deck d) {
		//loop to cards to deck and empty hand
		for(int count= 0; count < hand.getCards().length; count++)
		{
			d.addToBottom(hand.getCards()[count]);
		}
		hand.emptyHand();
	}
	
	/**
	 * @return the player's hand
	 */
	public Hand getHand() {
		return hand;
	}

}
