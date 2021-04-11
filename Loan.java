//abstract class named as loan
public abstract class Loan implements LoanConstants{
	  //private fields to hold the loan data
    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    private double interestRate;
    private int term;

  //parameterized constructor
    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
    	 //checking if loan amount is more than 500000, we will throw exception
    	if(loanAmount>500000)
            throw new IllegalArgumentException("loan amount is more than 500000");
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.loanAmount = loanAmount;
      //for setting the loan term, we will call one function
        this.term = getCorrectTerm(term);
    }
    //this function will take the loan term from user
    //and set it to nearest standard term
    private int getCorrectTerm(int term)
    {
    	//if loan term is less than 3 years and it is not equal to 1 year
    	//then we will set the term to 1 year that is short term
        if(term != shortTerm && term < mediumTerm)
            return shortTerm;
        //similar way, if the loan term is less than 5 year and not equal to 3 years then 
        //we will set loan term to 3 years
        if(term != mediumTerm && term < longTerm)
            return mediumTerm;
      //if the loan term is more than 5 years then we will set term to 5 years
        if(term != longTerm )
            return longTerm;
        return term;
    }


    //to string method to print all details of the loan
    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", customerLastName='" + customerLastName + '\'' +
                ", loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }

    //getters and setters for all the fields
    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
