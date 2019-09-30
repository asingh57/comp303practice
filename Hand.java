package comp303midtermpractice;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Hand implements Comparable<Hand>, Iterable<Card>{
	private HashSet<Card> cards = new HashSet<Card>(); 
	int upper_bound;
	
	@Override
	public Iterator<Card> iterator()
	{
		return cards.iterator();
	}
	
	public Hand(int upper_bound) {
		assert upper_bound>0;
		this.upper_bound=upper_bound;
	}
	public void add(Card card) {		
		assert !this.isFull() && !this.contains(card);
		cards.add(card);
	}
	public void remove(Card card) {
		assert !this.isEmpty() && this.contains(card);
		cards.remove(card);
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	public boolean isFull() {
		return this.size()==this.upper_bound;
	}
	
	public int size() {
		return this.cards.size();
	}
	
	public boolean contains(Card card) {
		assert card != null;
		return this.cards.contains(card);
	}
	
	@Override
	public int compareTo(Hand other) {
	    return this.size()-other.size();
	}
	
	public static Comparator<Hand> AscendingComparator(){
		return new Comparator<Hand>(){
			@Override
			public int compare(Hand h1, Hand h2){
				return h1.size()-h2.size();
			}
		};
	}
	
	public static Comparator<Hand> DescendingComparator(){
		return new Comparator<Hand>(){
			@Override
			public int compare(Hand h1, Hand h2){
				return h2.size()-h1.size();
			}
		};
	}
	
	public static Comparator<Hand> RankComparator(Rank rk){
		
		return new Comparator<Hand>(){
			@Override
			public int compare(Hand h1, Hand h2){
				return count(h1,rk)-count(h2,rk);
			}
			private int count(Hand h, Rank r) {
				int ct=0;
				for(Card c: h.cards) {
					if(c.getRank()==r) {
						ct++;
					}
				}
				return ct;
			}
		};
	}

	public static void main(String[] args) {
		Hand hand1 = new Hand(3);
		Hand hand2 = new Hand(3);
		hand1.add(new Card(Rank.ACE, Suit.CLUBS));
		Comparator<Hand> comparator= UniversalComparator.ASC;
		System.out.println(comparator.compare(hand1, hand2));
		comparator= UniversalComparator.DESC;
		System.out.println(comparator.compare(hand1, hand2));
	}

}
