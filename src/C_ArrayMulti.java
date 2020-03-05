
public class C_ArrayMulti {

	public static void main(String[] args) {
		/*int rows = 5;
		int columns = 3;

		int[][] array = new int[5][3];*/

		/*for(int i = 0; i<rows; i++)
		    for (int j = 0; j<columns; j++)
		        array[i][j] = 0;*/
		int array[][] = {{1,2,3},{4,5,6}, {7,8,9,},{10,11,12},{13,14,15}};  // this means 5 rows, 3 columns
		for(int i = 0; i<5; i++)
		{
		    for(int j = 0; j<3; j++)
		    {
		        System.out.print(array[i][j]); 
		    }
		    System.out.println();  // to print on next line

	}

}
}
