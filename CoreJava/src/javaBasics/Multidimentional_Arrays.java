package javaBasics;

public class Multidimentional_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] MA = new int [3] [3];
		
		MA[0][0] = 1;
		MA[0][1] = 2;
		MA[0][2] = 3;
		
		MA[1][0] = 5;
		MA[1][1] = 8;
		MA[1][2] = 9;
		
		MA[2][0] = 7;
		MA[2][1] = 2;
		MA[2][2] = 3;
		
		/*int b[][] = {{1,2,3}, {5,8,9}, {7,2,3}};
		System.out.println(b[0][0]);*/
		
		for (int i=0; i<=2;i++) // stands for row
		{
			for (int j=0;j<3;j++) // stands for column
			{
				System.out.print(MA [i][j]); 
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		
		

	}

}

/*1 2 3
5 8 9
7 2 3*/