/**
 * 
 * @author ghyzel
 *
 */
public class Hand {
	
	/**
	 * The cards in the hand
	 */
	private Card [] cards;
	
	/**
	 * Creates an empty hand
	 */
	public Hand() {
		//Initializing an empty array. 
		//Calling cards.length on this array would return 0
		cards = new Card[0];		
	}

	/**
	 * Adds Card c to the hand
	 * 
	 * @param c card to be added
	 */
	public void addCard(Card c) {
		//create deep copy of array
		Card [] array = new Card[cards.length + 1];
		//for loop to fill array with same contents
		for(int z= 0; z < array.length-1; z++)
		{
			array[z]= cards[z];
		}
		//equal array to last card to drawn card
		array[array.length-1]=c;
		cards= array;
		
	}
	
	/**
	 * @return number of cards in the hand
	 */
	public int size() {
		return cards.length;
	}
	
	/**
	 * Returns an array of all the cards in the hand
	 * 
	 * @return the cards in the hand
	 */
	public Card[] getCards() {
		// card object
		Card[] array= new Card[cards.length];
		//loop to fill array
		for(int count= 0; count < cards.length; count++)
		{
			
			array[count]= this.cards[count];
		}
		return array;
	}
	
	/**
	 * Empties the hand, and returns an array containing the discarded cards.
	 * 
	 * @return the discarded cards
	 */
	public Card[] emptyHand() {
		//card object
		Card[] array= new Card[cards.length];
		//loop to fill array
		for(int count= 0; count < cards.length; count++)
		{
			
			array[count]= this.cards[count];
		}
		//empty array
		this.cards= new Card[0];
		
		return array;
	}
	
	/**
	 * Returns a String representation of the hand
	 * 
	 * E.g.
	 * 
	 * "Empty Hand"
	 * "1. ACE OF SPADES\n2. QUEEN OF HEARTS"
	 * 
	 * @return a String representing the hand
	 */
	@Override
	public String toString() {
		
		String hand = "";
		//if hand is empty
		if(cards.length == 0)
		{
			return "Empty Hand";
		}
		//loop for toString
		for(int count= 0; count < cards.length-1; count++)
		{
			
			hand = count + ". " + cards[count];
		}
		return hand;
			
	}

}
