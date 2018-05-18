package usageofConcepts;

import java.util.Date;
import java.util.Scanner;

public abstract class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String libraryAddress = "Hicksville, NY"; 
		String[] bookName;
		String[] bookID;
		String deptCategory;	
	}
	public static boolean checkIn() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your Membership ID");
		String libraryID = s1.nextLine(); 
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your Passcode");
		Integer passCode = s2.nextInt();
		
		Visitor v = new Visitor();
		if(libraryID.equals(v.visitorID) && passCode.equals(v.getVisitorPasscode())) {
			return true;
		} 
		else
		return false;
	}
		
	}


