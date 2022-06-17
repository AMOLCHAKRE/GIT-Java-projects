package javaOOPS;

public class FunctionOverriding extends FunctionOverloading {
	
	public void overriding()
	{
		System.out.println("Child overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		FunctionOverriding override = new FunctionOverriding();
		override.overriding();  //This is function overriding which has same method,same name and same same parameters
	}

}
