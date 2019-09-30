package comp303midtermpractice;
import java.util.Scanner;

public class TwelveDays {

	static String[] DAYS = {"first", "second", "third", "fourth",
			"fifth", "sixth", "seventh", "eighth",
			"ninth", "tenth", "eleventh", "twelfth"};

	static String[] GIFTS = {
	"a partridge in a pear tree",
	"two turtle doves",
	"three French Hens",
	"four Calling Birds",
	"five Golden Rings",
	"six Geese a Laying",
	"seven Swans a Swimming",
	"eight Maids a Milking",
	"nine Ladies Dancing",
	"ten Lords a Leaping",
	"eleven Pipers Piping",
	"twelve Drummers Drumming"
	};
	
	static String[] NUMS= {"1st","2nd","3rd","4th","5th","6th",
			"7th","8th","9th","10th","11th", "12th"};
	
	/*Writes poem iteratively
	 * 
	 * @param is_digit whether it day is a digit or word
	 * */
	
	private static String poem(boolean is_digit) {
		
		String poem="";
		String gift_list="";
		
		String[] enumeration=DAYS;
		if(is_digit) {
			enumeration=NUMS;
		}
		
		for(int i=0;i<GIFTS.length;i++) {
			poem+="On the "+enumeration[i]+" day of Christmas my true love sent to me: \n";	
			if(i==0) {
				poem+=gift_list+GIFTS[i]+"\n";					
			}
			else {
				poem+=gift_list+"and "+GIFTS[i]+"\n";	
			}
			gift_list+=GIFTS[i]+"\n"; //cache gift list to improve performance
		}
		return poem;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String type= input.next();
		input.close();
		System.out.println(poem(type.compareTo("digit")==0));
	}

}
