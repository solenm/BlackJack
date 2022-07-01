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

}
