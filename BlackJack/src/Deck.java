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
	
	/**
	 * Shifts all the cards in the deck right by one place
	 */
	private void shiftRightOne() {
		//card array
		Card[] array= new Card[numCardsInDeck+1];
		//loop to fill array of next cards over
		for(int count= 0; count < cards.length; count++)
		{
			array[count+1]= cards[count];
		}
		cards= array;
	}	
	/**
	 * Add c to the bottom of the deck
	 * Print "Deck Full" when count equals the size of the deck
	 * @param c card to add
	 */	
	public void addToBottom(Card c) {
		//if deck is less than 52
		if(numCardsInDeck < 52)
		{
			//shift right and take first card
			shiftRightOne();
			cards[0]= c;
			numCardsInDeck++;
		}
		else
		{
			System.out.println("Error Deck is already full.");
		}
		
 	}

}
