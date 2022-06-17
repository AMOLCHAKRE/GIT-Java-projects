package interviewPart;

import java.util.ArrayList;

public class Compare2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question :- Compare same indexes of two different array and store it in new
		// array

		int A[] = { 1, 4, 2, 3 };
		int B[] = { 1, 5, 6, 3 }; // 1,3
		//int AB []= new int [3];
		// not sure length of array so creating dynamic arraylist

		ArrayList <Integer> AL = new ArrayList<Integer>();
		
		for (int i=0;i<A.length;i++)
		{
			if(A[i] == B[i])
			{
				AL.add(B[i]);
			}
		}
			
			Object[] c = AL.toArray();
			
			for ( Object ob: c)
			{
				System.out.print(ob);
			}
			
		}

}
