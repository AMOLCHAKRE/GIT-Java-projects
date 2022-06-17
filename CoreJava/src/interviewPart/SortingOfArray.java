package interviewPart;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question:- Sort array in Ascending and Descending order
		
		int A[] = {1,4,5,9,3,8}; // 1,3,4,5,8,9
		int temp;
		
		// 1,3,4,5,8,9
		
		for(int i=0;i<6;i++) // outer loop
		{
			for (int j=i+1;j<6;j++)
			{
				if(A[i]>A[j]);
				{
					//Swapping logic
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;	
				}
			}
		}		
				for (int i=0;i<6;i++)
				{
					System.out.println(A[i]);
				}
	}
}
