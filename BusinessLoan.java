//Business Loan class to create the business loan
public class BusinessLoan extends Loan{

	//parameterized constructor, as this class inheriting loan class
    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) {
    	//calling the constructor of loan class and adding 500 in loan amount as fees
    	super(loanNumber, customerLastName, loanAmount+500, term);
    	  //the interest rate as 1% higher than prime interest rate
    	this.setInterestRate(primeInterestRate+1);
    }
    
    @Override
    public String toString() {
        return "BusinessLoan "+super.toString();
    }


}
