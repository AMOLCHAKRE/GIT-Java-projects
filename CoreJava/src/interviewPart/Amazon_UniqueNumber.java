package interviewPart;

import java.util.ArrayList;

public class Amazon_UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,2,2,2,4,4,4,6,6,6,6,8,3,3,3};
		//int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// Print unique number from the list- Amazon
		// print the string in reverse
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		for (int i = 0; i<a.length; i++) 
		{
			int k = 0;
			
			if (!AL.contains(a[i])) 
			{
				AL.add(a[i]);
				k++;
				
				for (int j = i + 1; j<a.length; j++) 
				{
					if (a[i] == a[j]) 
					{
						k++;
					}
				}
				
				System.out.println(a[i]);
				System.out.println(k);
				if (k == 1)
					System.out.println(a[i] + "is unique number");
			}
		}
	}

}
