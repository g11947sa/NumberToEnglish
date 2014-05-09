package pairpro.pack;
import java.util.Scanner;

public class NumberToEnglish {
	
	static String[] number = {"zero","one","two","three","four",
						"five","six","seven","eight","nine","ten"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}
	
	static String translateEng(int n) {
		return number[n];
	}
}
