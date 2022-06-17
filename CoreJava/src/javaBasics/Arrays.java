package javaBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i =10;
		String a = "Hello";
	// Arrays is a container which stores multiple values in same data types
		System.out.println(a);
		
	int A [] =new int[5]; // Declare an array and set up memory allocation
	A[0] = 3;
	A[1] = 5;
	A[2] = 4;
	A[3] = 9;
	A[4] = 15; // initialized values into arrays
	
	int B[] = {1,3,5,7,8,4,45}; //Dynamically done memory allocation
	
	for (int i=0;i<B.length;i++)
	{
		System.out.println(B[i]); // retrieved values present in that array
	}
		
		
	}

}
