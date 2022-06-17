package javaOOPS;

//Function overloading rules
//Either argument count should be different
// Or data types should be different
public class FunctionOverloading {
	
	public void GetData(int a)
	{
		System.out.println(a);
	}
	
	public void GetData(String B)
	{
		System.out.println(B);
	}
	public void GetData(int a, String B)
	{
		System.out.println(a);
	}
	
	public void overriding()
	{
		System.out.println("parent overriding");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverloading Demo = new FunctionOverloading();
		Demo.GetData(2);
		Demo.GetData("Hello");
		Demo.GetData(15, "B");
		
	}

}
