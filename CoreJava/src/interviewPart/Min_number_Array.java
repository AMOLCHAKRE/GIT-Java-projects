package interviewPart;

public class Min_number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 4 5
		 * 3 4 7
		 * 1 2 9 */
		
		int minarray [][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = minarray[0][0];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (minarray[i][j]<min)
				{
					min=minarray[i][j];
				}
			}
		} 
		System.out.println(min);

	}

}
