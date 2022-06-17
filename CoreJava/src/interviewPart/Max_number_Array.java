package interviewPart;

public class Max_number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 4 5
		 * 3 4 7
		 * 1 2 15 */
		
		int maxarray [][] = {{2,4,5},{3,4,7},{1,3,15}};
		int max = maxarray[0][0];
		
		for (int i=0;i<3;i++) // stand for row
		{
			for (int j=0;j<3;j++) // stand for column
			{
				if (maxarray[i][j]>max)
					max=maxarray[i][j];
				{
				
			}
		}
	}	

	System.out.println(max);	
}
}
