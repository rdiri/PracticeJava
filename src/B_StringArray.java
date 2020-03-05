
public class B_StringArray 
{

	public static void main(String[] args) 
{
		
		// to find the sum of the numbers in array
		int sum=0;
		int a[] = {2,4,6,8,10};
		for (int i=0; i<a.length; i++) // loops until the lenght of the array and the numbers in the array
		{
		sum=sum+a[i];
		if (a[i]==8) // this gives the value at the index i and compare with 8
			{
			System.out.println("The index location of 8 is: "+i);
			
		}
		
		}
		System.out.println("The sum of Array is: "+sum);
		
	
}
}
