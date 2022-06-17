package demoPackage;

public class SuperKeyWord_Child extends SuperKeyWord_Parents {
	
	String name = "QA Demo2";
	
	public SuperKeyWord_Child()
	{
		super(); // this should be always first line
		System.out.println("I am child class constructor");
	}
	public void GetDemo()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void GetData()
	{
		System.out.println("I am Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyWord_Child SKC = new SuperKeyWord_Child ();
		SKC.GetDemo();
		SKC.GetData();

	}

}
