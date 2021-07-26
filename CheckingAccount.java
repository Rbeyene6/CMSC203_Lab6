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


public class CheckingAccount extends BankAccount{
private static final double FEE=15.0;//the cost of clearing one check

/*
 * Constructor initialize accountNumber to be 
 * the current value in accountNumber concatenated with –10 
 * 
 * @param name name 
 * @param amount initial amount in account
 */

public CheckingAccount(String name, double amount) {
	//calls superclass constructor
	super(name, amount);
	//calls mutator method to set the account Number
	setAccountNumber(getAccountNumber() + "-10");
	
}
public boolean withdraw(double amount) {
	//overrides the withdraw method in the superclass
	return super.withdraw(amount+FEE);
}
}
