package javaOOPS;

public class NestedLoopLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for (int i=0; i<=4;i++) // (outer loop) this block execute 4 times
		{
			System.out.println("Outer block strted");
			
			for (int j=1;j<=4-i;j++)  //inner loop
			{
				System.out.println("Inner block running");
				System.out.print(k);
				k++;
		}
			System.out.println("Outer block finished");
	}

	}

}
