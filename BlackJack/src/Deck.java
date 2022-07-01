import java.util.Random;
public class Deck {
	/**
	 * Cards in the deck
	 */
	private Card [] cards;
	
	/**
	 * The number of cards in the physical deck on the table.
	 */
	private int numCardsInDeck;
	
	/**
	 * Create a standard 52 card deck w/ one of each type (Ace, King, Queen...) for each Suit (Hearts, Spades ..)
	 */
	public Deck() {

		Card.Suit [] suits = Card.Suit.values(); //creates an array of all of the Suits
		Card.Type [] types = Card.Type.values(); //creates an array of all of the Types
		cards = new Card[suits.length*types.length]; //sets the size of cards to 52 (types & suits)
		numCardsInDeck = 0;

		for(int i =0; i<suits.length; i++)
		{
			for(int j = 0; j<types.length; j++)
			{
				//Assigns 52 unique cards to the cards deck
				cards[numCardsInDeck] = new Card(types[j], suits[i]); 
				numCardsInDeck++; //increments the number of cards in the deck
			}
		}	
	}
	/**
	 * Draws card from the top
	 * @return the top card
	 */
	public Card draw() {
		Card top;
		//if cards in deck is greater than 0
		if(numCardsInDeck > 0)
		{
			//take top card from the deck and decrease deck physically
			top= cards[cards.length-1];
			Card[] array= new Card[cards.length-1];
			for(int count= 0; count < array.length; count++)
			{
				array[count]= cards[count];
			}
			numCardsInDeck--;
			cards= array;
			
			return top;
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Swaps card at a with card at b
	 * @param a card to be swapped with b
	 * @param b card to be swapped with a
	 */
	private void swap(int a, int b) {
		Card holder;
		holder= cards[a];
		cards[a]= cards[b];
		cards[b]= holder;
		
	}
}
