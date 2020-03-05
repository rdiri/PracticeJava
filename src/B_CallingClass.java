
public class B_CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object of methodsClass and than call the methods of that class
		
		B_MethodsClass m = new B_MethodsClass();
		m.ValidateHeader();
		//m.ValidateFooter();
		System.out.println(m.ValidateFooter());
		
		
	}

	
}
