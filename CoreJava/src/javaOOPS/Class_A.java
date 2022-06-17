package javaOOPS;

public class Class_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Class_A pv = new Class_A();
		pv.Private();	
	}

	public char[] i;
		
		void Default()
		{
			System.out.println("Hello Default access modifier");
		}
		
		private void Private()
		{
			System.out.println("Hello private access modifier");
		}
		
		protected void Protected()
		{
			System.out.println("Hello private access modifier");
		}
	

}
