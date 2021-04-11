//class to create personal loan, it is inheriting loan class
public class PersonalLoan extends Loan{
	//parameterized constructor
    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) {
    	//calling constructor of loan class with amount increased by $200 as the loan fees
    	super(loanNumber, customerLastName, loanAmount+200, term);
    	//setting interest rate as 2% more than prime interest rate
    	this.setInterestRate(primeInterestRate+2);
    }
    
    @Override
    public String toString() {
        return "PersonalLoan "+super.toString();
    }
}
