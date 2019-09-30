package comp303midtermpractice;
import java.lang.Math;

public class card_boolean {//this is disgusting code, no one should do this ever
	Suit card_suit;
	Rank card_rank;
	
	/**	 
	 * Creates a new card object.
	 * 
	 * @param list list of booleans.
	 * @pre list.length == 6
	 */
	public card_boolean(boolean[] list) {
		assert list.length==6;
		int card_choice=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]) {
				card_choice+=Math.pow(2, i);
			}
		}
		assert card_choice<52;
		this.card_rank=Rank.values()[card_choice%13];
		this.card_suit = Suit.values()[card_choice/13];
				
		return;
	}
	
	/**
	 * @return The rank of the card.
	 */
	public Rank getRank()
	{
		return card_rank;
	}
	
	/**
	 * @return The suit of the card.
	 */
	public Suit getSuit()
	{
		return card_suit;
	}
	
	public static void main(String[] args) {
		boolean arr[]= {true,true,true,true,true,false};
		card_boolean bl = new card_boolean(arr);
		card_boolean n = new card_boolean(arr);
	}
}
