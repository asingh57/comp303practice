package comp303midtermpractice;
import java.util.ArrayList;
import java.util.List;

public class MultiDeck {
	private List<Deck> deck_list = new ArrayList<>();
	/**
	 * 
	 * @param deck_list array of decks
	 * @pre deck_list.length>0
	 */
	public MultiDeck(Deck[] deck_list) {
			assert deck_list.length>0;
			for(int i=0;i<deck_list.length;i++) {
				this.deck_list.add(deck_list[i]);
			}			
	}
	
	/**
	 * 
	 * @param original Original Multideck
	 * @param is_shallow Shallow or Deep copy
	 */
	public MultiDeck(MultiDeck original, boolean is_shallow) {
		assert is_shallow == true || is_shallow ==false; 
		
		if(is_shallow) {
			this.deck_list=original.deck_list;
		}
		else {
			this.deck_list = new ArrayList<>();
			for(int i=0;i<original.deck_list.size();i++) {
				List<Card> card_list= original.deck_list.get(i).getCards();
				Deck new_deck= new Deck();
				this.deck_list.add(new_deck);
				while(!new_deck.isEmpty()) {
					new_deck.draw();//empty this deck
				}
				for(Card card : card_list) {
					Card new_card = new Card(card.getRank(),card.getSuit());
					new_deck.push(new_card);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Deck dc= new Deck();
		Deck dc2= new Deck();
		Deck[] md_arr= {dc,dc2}; 
		MultiDeck md= new MultiDeck(md_arr);
		MultiDeck md2= new MultiDeck(md,true);
		MultiDeck md3= new MultiDeck(md,false);
		
		System.out.println("done");
		
	}
	
}
