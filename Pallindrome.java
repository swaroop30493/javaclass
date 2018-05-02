package firstP;

import java.util.Scanner;

public class Pallindrome {

	public static String pallindrome (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String InputString = scan.nextLine();
		
		String ReverseString = "";
		
		
		InputString = InputString.replace(" ", "");
		
		for (int i =InputString.length()-1 ; i>=0 ; i--) {
			
			
			
			ReverseString = ReverseString + InputString.charAt(i);
		}
		
		
		if (InputString.equals(ReverseString))
			System.out.println("It is a pallindrome");
		else
			System.out.println("It's not a pallindrome");
		
		return ReverseString;
		
	}
	public static void main(String[] args) {
		
		
		pallindrome(args);
		
		
	}

}
