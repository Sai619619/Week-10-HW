//Sai Abbavaram
//3-21-21
//CPSC 24500
//This program uses Construction Loan Interface. 

//import to take user input
import java.util.Scanner;

//class to create the loans
public class CreateLoans {

	//main function to start the execution of the program
	public static void main(String[] args)
    {
		//array of size 5 to hold the objects of different loan types
        Loan[] loanArr = new Loan[5];
        //scanner object to take user input
        Scanner in = new Scanner(System.in);
        //taking prime interest rate from user
        System.out.println("please enter prime interest rate (float)");
        double primeInterestRate =Double.parseDouble(in.next());
        int i=0;
        //starting a do-while loop to take input for 5 objects
        do {
        	//prompting user for type of the loan that they want to create
            System.out.println("please enter the loan type you want to enter");
            System.out.println("please enter \n1 for personal loan(loan fees $200) \n2 for business loan(loan fees $500)");
            int choice = Integer.parseInt(in.next());
            //based on choice we will create object, if choice is wrong, then will show error
            if(choice!=1&&choice!=2)
            {
                System.out.println("wrong choice");
                continue;
            }
            //getting loan details from getLoan()
            loanArr[i] = getLoan(primeInterestRate,choice);
            i++;
        }while (i<5);

        //iterating on the loan array
        //printing the loan details
        for(Loan loan : loanArr)
        {
            System.out.println(loan.toString());
        }

    }

	//getLoan() to accept primeinterestrate and choice of user
    private static Loan getLoan(double primeInterestRate, int choice)
    {

    	//making scanner object
        Scanner in = new Scanner(System.in);
        //asking for loan account number
        System.out.println("enter the loan number (integer)");
        int loanNumber = Integer.parseInt(in.next());
        //asking for user's last name
        System.out.println("enter last name (string)");
        String lastname = in.next();
        //amount of the loan
        System.out.println("please enter loan amount(float)");
        double loanAmount = Double.parseDouble(in.next());
        //term of the loan
        System.out.println("enter term for loan(integer)");
        int term = Integer.parseInt(in.next());
        //based on choice returning the appropriate loan object
        //if choice is 1 we will return personal loan object otherwise business loan object
        if(choice==1)
            return new PersonalLoan(loanNumber,lastname,loanAmount,term,primeInterestRate);
        else return new BusinessLoan(loanNumber,lastname,loanAmount,term,primeInterestRate);
    }
}

