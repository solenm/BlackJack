
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
	 * Returns the maximum value of the hand that does not result in a bust
	 * @param h Hand whose value is returned
	 * @return value of h
	 */
	public static int getValueOfHand(Hand h) {
		//local variables
		int ace= 0;
		int hand= 0;
		int aceCounter= 0;
		boolean e11= false;
		//loop to check value of cards in the hand
		for(int counter= 0; counter < h.size(); counter++)
		{
			if( getValueOfCard(h.getCards()[counter]) == 1)
			{
				ace++;
			}
			else
			{
				hand= hand +  getValueOfCard(h.getCards()[counter]);
			}
			
		}
		aceCounter= ace;
		//loop to determine the value of each ace
		for(int count= 0; count < aceCounter; count++)
		{
			if( getValueOfCard(h.getCards()[count]) < 11)
			{
				hand= hand + 11;
				ace--;
				e11= true;
			}
			else
			{
				hand= hand + ace;
			}
				
		}
		if(hand > 21 && e11)
		{
			hand= hand-10;
		}
		return hand;
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
