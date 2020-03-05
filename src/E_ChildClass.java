
public class E_ChildClass extends E_ParentClass{
	// Declare variables to use outside of main block
	
		public String name = "Child Rama Sundari";
		
		public E_ChildClass()
		{
			super();
			System.out.println("This is Child Class Constructor");
		}
		
		
		public void getString()
		{
			System.out.println(name);
			System.out.println(super.name);  //super is the keyword used to call the properties from Parent Class that was inherited
			//super.getString();
		}

	public static void main(String[] args) {
		
		E_ChildClass c=new E_ChildClass();  
		c.getString();
		E_ParentClass p=new E_ParentClass();
		p.getString();
			
	}

}
