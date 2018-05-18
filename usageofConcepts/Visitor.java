package usageofConcepts;

import java.util.Scanner;

public class Visitor extends Library {

	String visitorName;
	public String visitorID;
	private Integer visitorPasscode;
	Integer visitorPhn;
	String visitorAddress;
	
	public Integer rentBook () {
		int confirmNum = 0;
		Scanner scan  = new Scanner(System.in);
		String bookName = scan.nextLine(); 
		return confirmNum;
	}

	public Integer getVisitorPasscode() {
		return visitorPasscode;
	}

	public void setVisitorPasscode(Integer visitorPasscode) {
		this.visitorPasscode = visitorPasscode;
	}
	
	public static boolean checkIn() {
		return false;
	}
}
