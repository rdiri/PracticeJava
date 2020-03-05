package Interface;

public interface BankingClientInterface {

	// interface has methods without body
	// this interface will be implemented by class using keyword "implements" which will implement the methods	
	// only class can implement methods which are present in the interface
	
	
	public void PaycreditCard();
	public void TransferBalance();
	void CheckingBalance();     //By default inteface methods are public, so does not give error here.
}
