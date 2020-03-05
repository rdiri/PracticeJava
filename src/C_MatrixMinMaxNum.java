
public class C_MatrixMinMaxNum {

	public static void main(String[] args) {
		int row = 3;
		int column = 3;
		int array[][]= {{2,4,5},{1,4,7},{8,2,9}};
		int min_num=array[0][0];
		int min_column=0;
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column;j++)
			{
								
				if (array[i][j]<min_num)
				{
					min_num=array[i][j];
					min_column=j;
					
				}
			}
		}
		int max=array[0][min_column];
		int k=0;
		while(k<3)
		{
			if(array[k][min_column]>max)
			{
				max=array[k][min_column];
			}
			k++;
		}
		System.out.println(min_num);			
		System.out.println(max);
}
}		
		



