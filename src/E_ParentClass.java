
public class E_ParentClass {

	// Declare variables to use outside of main block
	
	String name = "Parent - Rama Sundari";
	
	public E_ParentClass()
	{
		System.out.println("This is Parent Class Constructor");
	}
	
	
	public void getString()
	{
		System.out.println("This is getString method from ParentClass: "+name);
	}
	public static void main(String[] args) {
		E_ParentClass p=new E_ParentClass();
		p.getString();

	}

}
