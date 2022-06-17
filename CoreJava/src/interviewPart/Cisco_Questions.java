package interviewPart;

public class Cisco_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 4 0
		 * 3 4 7
		 * 1 2 15 */
		//Question:- find out minimum row and then based on that row find out maximum column number
		//Output = 15 
		//Step1 :- Find out the minimum number
		//Step2:- Identify column of minimum number
		//Step3:- Find out the maximum number in identified column

		int minarray [][] = {{2,4,0},{3,4,7},{1,2,18}};
		int min = minarray[0][0];
		int mincolumn = 0;
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (minarray[i][j]<min)
					min = minarray[i][j];
				mincolumn = j;
				{
			}
		}
	}
		int k = 0;
		int max = minarray[0][mincolumn];
		
		while(k<3)
		{
			if(minarray[k][mincolumn]>max)
			{
				max = minarray[k][mincolumn];
			}
			k++;
		}
		System.out.println(min);
		System.out.println(max);
}
}
