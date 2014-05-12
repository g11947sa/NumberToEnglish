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
		return countHundred(n);
	}
	static String countHundred(int n) {
		String ans = "";
		int h = n / 100;
		if (h > 0) ans = number[h]+" hundred ";
		if (n % 100 == 0) return ans.substring(0, ans.length()-1);;
		
		if(n % 100 >= 20) {
			int t = (n % 100) / 10;
			int o = (n % 100) % 10;
			if(o == 0) ans += overteen[t];
			else ans +=  overteen[t] + " " +number[o];
		}
		else ans += number[n % 100];
		return ans;
	}
}
