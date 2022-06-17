package coreJava_part_2;

public class Constructor {
	
	    // Default Constructor
		public Constructor()
		{
			System.out.println("I am a constructor");
			System.out.println("I am checking constructor");
		}
		
		//Parameterized Constructor
		public Constructor(int a, int b)
		{
			System.out.println("I am the paramerterized constructor");
			int c=a+b;
			System.out.println(c);
		}
				public Constructor(String str)
				{
					System.out.println(str);
					
				}
		public void Getdata()
		{
			System.out.println("I am not a constructor");
		}

		public static void main(String[] args) {
			
			Constructor demo = new Constructor();
			Constructor demo1 = new Constructor(5,8);
			Constructor demo2 = new Constructor("Hello");
			
			
			// TODO Auto-generated method stub
	}

}
