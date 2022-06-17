package interviewPart;

public class MaxDiffinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question:- Max difference between any adjacent index in array
		int diff = 0;
		int[] A = { 3, 6, 10, 15, 28 }; // 3,4,5,13

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i + 1] - A[i] > diff)
		
			{
				diff = A[i + 1] - A[i];
			}

		}

		System.out.println(diff);
	}

}
