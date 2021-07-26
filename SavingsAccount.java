/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg & Prof. Ashique Tanveer
 * Description: The program creates a checking and savings account for clients
 * It concatenates the numbers with "-10" for checking and incrementing numbers
 * "-number" for savings.  Calculates interest for savings.
 * Due: 7/26/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Rebecca Beyene_________
*/

public class SavingsAccount extends BankAccount {
private double rate=2.5;//annual interest rate
private int savingsNumber=0;
private String accountNumber="";

/*
 * constructor initialize accountNumber to be the current value 
 * in the superclass accountNumber (the hidden instance variable) concatenated
 * with a hyphen and then the savingsNumber.
 * 
 * @param name name 
 * @param amount initial amount in account
 */
public SavingsAccount(String name,double amount) {
	//calls superclass constructor 
	super(name, amount);
	accountNumber = super.getAccountNumber() + "-" + savingsNumber;
}

public void postInterest() {
	rate=(rate/100)/12;
//calculate one month's worth of interest on the balance and 
//deposit it into the account.
	setBalance(getBalance()+(getBalance() * rate) );
}
//overrides the getAccountNumber method in the superclass
public String getAccountNumber() {
	return accountNumber; 
}
/*
 * constructor call the copy constructor of the superclass,
 * assign the savingsNumber to be one more than the savingsNumber
 *  of the original savings account.
 * 
 * 
 * 
 */

public SavingsAccount(SavingsAccount oldAccount,double amount) {
	//calls superclass constructor
	super(oldAccount, amount);
	accountNumber=(oldAccount.getAccountNumber()+1);
	
}
}
