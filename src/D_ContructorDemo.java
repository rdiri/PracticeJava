
public class D_ContructorDemo {
	
	
	// contrcutor will not return any value
	// Consrtructor name should be classname
	//This is default constructor--implicitly executed when you do not define a constructor
	public D_ContructorDemo()
	{
		System.out.println("I am from the Constructor");
	}
	
	//this is a method (method has return value)
	public void Method_M()
	{
		System.out.println("I am from the Method_M");
	}
	
	//parameterized constructor (same as class name)- have to call explicitly called with 2 arguments 
	public D_ContructorDemo(int a, int b)
	{
		System.out.println("This is parameterized constructor with two arguments");
		int c=(a+b);
		System.out.println("Executed the sum of two numbers :"+c);
		
		
	}
	
	//parameterized constructor (same as class name)- have to call explicitly called with on string argument
		public D_ContructorDemo(String str)
		{
		String s = str;
		System.out.println("This is parameterized constructor with string argument passed as :"+s);
		}

	public static void main(String[] args) {
		D_ContructorDemo d=new D_ContructorDemo();
		D_ContructorDemo cd=new D_ContructorDemo("Hi Rama"); 
		D_ContructorDemo c=new D_ContructorDemo(121,323); // object created and hence executed the block of code written in the contructor
		//cd.Method_M();
		
	
		
				
		

	}

}
