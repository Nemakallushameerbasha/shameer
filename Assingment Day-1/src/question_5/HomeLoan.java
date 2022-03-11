package question_5;

public class HomeLoan {private double loanPercentage;
private double loanAmount;
private int duration;
private String person;

public HomeLoan(double loanPercentage, double loanAmount, int duration, String person) {
	this.loanPercentage = loanPercentage;
	this.loanAmount = loanAmount;
	this.duration = duration;
	this.person = person;
}

public String getHomeLoan() {
	return loanPercentage+"  "+loanAmount+"  "+duration+"  "+person;
}

}
