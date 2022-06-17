package interviewPart;

public class SumofElements {

	//Question:- Create a Method which accepts Array and returns sum of all the elements in array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {1,2,3,4,5};
		
		int sum = Arraysum(A);
		
		System.out.println(sum);
		
		//Question:- //Print 5 Multiplication table without using Multiply operator
		
		int result = Mutiply(5,20);
		System.out.println(result);
	}
	
	private static int Mutiply(int i, int j) {
		int result = 0;
		int k=1;
		// i has to sum itself j times to get the result----> Approach/Algorithm 
		while (k<=j)
		{
			result = result+i;
			k++;
		}
		return result;
	}

	public static int Arraysum(int []A)
	{
		int sum = 0;
		//Extract every value of Array and sum each value with other
		for (int i=0;i<A.length;i++)
		{
			sum = sum+A[i];
		}
		
		return sum;
		
	}
}
