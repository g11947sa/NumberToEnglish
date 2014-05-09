package pairpro.pack;
import java.util.Scanner;

public class NumberToEnglish {
	
	static String[] number = {"zero","one","two","three","four",
						      "five","six","seven","eight","nine",
						      "ten", "eleven", "twelve", "thirteen", "fourteen"
						      , "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	static String[] overteen = {"", "", "twenty", "thirty", "fourty",
								"fifty", "sixty", "seventy", "eighty", "ninety"};
	
	static String[] overhundred = {"", "hundred"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}
	
	static String translateEng(int n) {
		if(n >= 20) {
		int t, o;
		t = n / 10;
		o = n % 10;
		if(o == 0) return overteen[t];
		else return overteen[t] + " " +number[o];
		}
		else return number[n];
	}
}
