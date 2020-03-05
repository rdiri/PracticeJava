package Interface;

public class DevelopingClass implements BankingClientInterface {

	public static void main(String[] args) {
	
	//DevelopingClass must implement all the interface methods	
		
		DevelopingClass d = new DevelopingClass(); //here the return type is DevelopingClass so d has all the methods
				d.login();
				d.PaycreditCard();
				d.TransferBalance();
				d.CheckingBalance();
				d.logout();
		BankingClientInterface bc = new DevelopingClass(); 	// here the return type is BankingClassInterface so bc has only those methods	
			bc.PaycreditCard();
			bc.TransferBalance();
			bc.CheckingBalance();
			
			//bc.do not have login & logout methods.
		
		
		

	}

	@Override
	public void PaycreditCard() {
		System.out.println("This is PaycreditCard Method");
	}

	@Override
	public void TransferBalance() {
		System.out.println("This is TransferBalance Method");
		
	}

	@Override
	public void CheckingBalance() {
		System.out.println("This is CheckingBalance Method");
		
	}
public void login() // you can also add own class methods
{
	System.out.println("This is Login method of DevelopingClass");
}
public void logout() 
{
	System.out.println("This is Logout method of DevelopingClass");
}
}

