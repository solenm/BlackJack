
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
	 * @return Hand the dealer's hand
	 */
	public Hand getHand() {
		return hand;
	}

}
