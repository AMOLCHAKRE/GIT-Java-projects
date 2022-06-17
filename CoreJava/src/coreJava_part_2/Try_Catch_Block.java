package coreJava_part_2;

public class Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b = 3;
		int c= 0;

		try
		{
			int k = b/c;
		}
		
		catch (ArithmeticException et)
		{
			System.out.println("Error on Arthmatic exception");
		}
		catch (Exception e)
		{
			System.out.println("Error message displayed");
		} 
		
		finally 
		{
			System.out.println("Delete cookies/close browser");
		}
		

	}

}
