package pairpro.pack;
import java.util.Scanner;

public class NumberToEnglish {
	
	static String[] number = {"zero","one","two","three","four",
						      "five","six","seven","eight","nine",
						      "ten", "eleven", "twelve", "thirteen", "fourteen"
						      , "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	static String[] overteen = {"", "", "twenty", "thirty", "fourty",
								"fifty", "sixty", "seventy", "eighty", "ninety"};
	
	static String[] overhundred = { "", "", "thousand", "million", "billion",
									"trillion", "quadrillion", "quintillion"};
	static String answer = "";
	static int flag = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		
		System.out.println(translateEng(input));
	}
	
	static String translateEng(long n) {
		if(n < 0) {
			System.out.println("0ˆÈã‚Ì®”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
			return answer;
		}
		separate(n, 0);
		return answer;
	}
	static String countHundred(long n) {
		String ans = "";
		long h = n / 100;
		if (h > 0) ans = number[(int)h]+" hundred";
		if (n % 100 == 0) return ans;
		
		if(n % 100 >= 20) {
			long t = (n % 100) / 10;
			long o = (n % 100) % 10;
			if(o == 0) ans += " " + overteen[(int)t];
			else ans +=  " " + overteen[(int)t] + " " +number[(int)o];
		}
		else ans += " " + number[(int)n % 100];
		return ans;
	}
	static void separate(long n, int count){
		if(n==0) {
			flag = count;
			return;
		}
		long x = n / 1000;
		separate(x, ++count);
		if(flag != count) answer += " ";
		answer += countHundred(n % 1000);
		answer += " " + overhundred[count];
		return;
	}
}
