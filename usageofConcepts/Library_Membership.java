package usageofConcepts;

import java.util.Date;

public class Library_Membership extends Library {

	String membershipType;
	Integer lengthMembership;
	String applicantName;
	Date applicantDOB;
	Integer applicantPhn;

	
	public Object signUp(String name, Date dob, Integer phn) {
		name = this.applicantName;
		dob = this.applicantDOB;
		phn = this.applicantPhn;
		return null;
	}
	
	
	
	
}

