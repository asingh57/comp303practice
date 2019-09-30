package comp303midtermpractice;
import java.util.Comparator;


public enum UniversalComparator implements Comparator<Hand>{

	  ASC{
		  public int compare(Hand h1, Hand h2) {return h1.size()-h2.size();};
	  }, 
	  DESC{
		  public int compare(Hand h1, Hand h2) {return h2.size()-h1.size();};
	  };     
}
