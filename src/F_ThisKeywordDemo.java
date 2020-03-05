
public class F_ThisKeywordDemo {
	int a=2;
	public void getData()
	{
		int a=5; // variable at method level is local variable - accessible within the method only
		int sum=(a+this.a); // "this" keyword to refer to variable at the class level.
		System.out.println("Method level Variable a value is: "+a);
		System.out.println("Class level variable a value is : "+this.a);
		System.out.println("Sum of variable a from class level & Method level is"+sum);
	}
		
	public static void main(String[] args) {
		F_ThisKeywordDemo tis = new F_ThisKeywordDemo();
		  tis.getData();
		
		
	}

}
