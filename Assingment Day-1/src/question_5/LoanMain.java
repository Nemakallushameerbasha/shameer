package question_5;

public class LoanMain {public static void main(String[] args) {
	
	HomeLoan homeLoan = new HomeLoan(6,5000000,36,"shameer");
	PersonalLoan personalLoan = new PersonalLoan(9,1000000,24,"uday");
	
	System.out.println(homeLoan.getHomeLoan());
	System.out.println(personalLoan.getPersonalLoan());

}

}
