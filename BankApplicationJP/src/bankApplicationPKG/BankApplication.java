package bankApplicationPKG;                                // declared a package

// this class is used to difine the application

public class BankApplication {                                  // declared the class

	public static void main(String[] args) {                  // main method 
		// TODO Auto-generated method stub
		
		BankAtm bAtm1 = new BankAtm(1, "SBI", "Bangalore",30000.00);         // created an object for SBI bank
 
		BankAtm bAtm2 = new BankAtm(2, "HDFC", "Pune",7000.00);                   // created an object for HDFC bank

		BankAtm bAtm3 = new BankAtm(3, "ICICI", "Mumbai",20000.00);            // created an object for ICICI bank
		
		System.out.println();         // printing Blank line
		System.out.println("****************   SBI BANK TRANSACTION    ***************");         // printing info
		bAtm1.withdraw(40000);                // trying to withdraw more than the balance amount
		bAtm1.withdraw(25000);                // trying to withdraw amount less than the balance amount and greate than 10000
		System.out.println();         // printing Blank line
		
		System.out.println("****************   HDFC BANK TRANSACTION   ***************");         // printing info
		bAtm2.withdraw(7000);                 // trying to withdraw amount equal to the balance amount
		bAtm2.deposit(5000);                 // deposting 5000 in HDFC bank account
		System.out.println();         // printing Blank line
		
		System.out.println("****************   ICICI BANK TRANSACTION  ***************");        // printing info
		bAtm3.withdraw(10000);                 // Trying to withdraw 10000 from ICICI bank
		bAtm3.deposit(20000);                 // deposting 20000 in HDFC bank account
	}

}
