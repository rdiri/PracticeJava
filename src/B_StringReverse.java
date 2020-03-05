
public class B_StringReverse {

	public static void main(String[] args) {
		
		// to reverse a string using CharAt method
		String a = "Rama";
		String b="";
		
		for (int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
			
		}
		System.out.println(b);
	}

}
