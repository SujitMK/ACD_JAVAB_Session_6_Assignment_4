package bankApplicationPKG;                         // declared a package

// this class is defined to build a Bank Atm Application

public class BankAtm {

	int atmId;                   // declared a Atm ID variable
	String bankName;           // declared Bank Name variable 
	String location;                // declared location variable
	Double balance;              // declared balance variable
	
	BankAtm(int atmId, String bankName, String location, Double balance)        // using parameterized constructor
	{
		// assigning values for instance variables
		
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	public void withdraw(double amt)                  // method to define withdraw logic
	{
		if(this.balance < 10000)                         // checking if the balance is less than 10000 INR
		{
			try                               // Using try block
			{
				System.out.println();                         // printing blank line
				System.out.println("Balance is : "+this.balance);         // printing balance
				throw new BankATMException("The Balance is less than 10,000 INR. You can not withdraw the amount.");   // throwing an user defined exception
			}
			catch(BankATMException bae)
			{
				System.out.println(bae);
				System.out.println();                         // printing blank line
			}
		}
		else if(this.balance < amt)        // checking if the balance is less than withdrawal amount
		{
			try                               // Using try block
			{
				System.out.println();                         // printing blank line
				System.out.println("Balance is : "+this.balance);         // printing balance
				System.out.println("Withdrawal Amount is : "+amt);         // Withdrawal Amount
				throw new BankATMException("The Balance is less than the withdrawal amount. You can not withdraw the amount.");   // throwing an user defined exception
			}
			catch(BankATMException bae)
			{
				System.out.println(bae);
				System.out.println();                         // printing blank line
			}
		}
		else                                                          // withdrawal happens successfully
		{
			System.out.println();                                           // printing blank line
			System.out.println("Balance Before Withdrawal is : "+this.balance);         // printing balance
			System.out.println("Withdrawal Amount is : "+amt);         // Withdrawal Amount
			this.balance -= amt;                                       // substracting withdrawal amount from balance
			System.out.println();                         // printing blank line
			System.out.println("Balance After Withdrawal is : "+this.balance);         // printing balance
			System.out.println("Withdrawal is successful !");         // printing info
		}
	}
	
	void deposit(double amt)
	{
		System.out.println();                         // printing blank line
		System.out.println("Balance Before Deposting is : "+this.balance);         // printing balance
		System.out.println("Depositing Amount is : "+amt);         // Withdrawal Amount
		this.balance += amt;                                   // Depositing the amount to balance
		System.out.println();                         // printing blank line
		System.out.println("Balance After Deposting is : "+this.balance);         // printing balance
		System.out.println("Deposting is successful !");         // printing info
	}
}
