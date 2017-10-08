package bankApplicationPKG;            // declared a package

// this class is used to define an user defined exception 

public class BankATMException extends Exception{                  // defined a class that extends Exception class
	
	BankATMException(String str)                   // Using a parameterized constructor
	{
		super(str);                                  // calling a super class constructor and passing string value
	}

}
