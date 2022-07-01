
public class Dealer {
	/**
	 * The dealers hand
	 */
	Hand hand;
	
	/**
	 * Construct a new dealer with an empty hand
	 */
	public Dealer() {
		hand= new Hand();
		
	}
	
	/**
	 * Dealer draws a card if his hand is worth less than 17 points and has less than 5 cards in in his hand.
	 * 
	 * @param deck
	 * @return
	 */
	public Card playTurn(Deck deck) {
		Card holder;
		if( BlackJack.getValueOfHand(hand) < 17 && hand.getCards().length < 5)
		{
			//draw cards and add them to the hand
			holder= deck.draw();
			hand.addCard(holder);
			return holder;
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * A method to check if the dealer has busted
	 * @return boolean true if the dealer has busted
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
	 * A method to check if the dealer will draw a card.
	 * @return
	 */
	public boolean isDone() {
		if( BlackJack.getValueOfHand(hand) > 17 || hand.getCards().length > 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the dealers cards to the deck
	 * @param d Deck to return the cards to
	 */
	public void returnCardstoDeck(Deck d) {
		//loop to return cards to deck
		for(int count= 0; count < hand.getCards().length; count++)
		{
			d.addToBottom(hand.getCards()[count]);
		}
		//empty hand
		hand.emptyHand();
	}
	
	/**
	 * @return Hand the dealer's hand
	 */
	public Hand getHand() {
		return hand;
	}

}
