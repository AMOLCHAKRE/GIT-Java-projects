package coreJava_part_2;

public class This_Feature_Demo {
	
	int a = 5;
	
	public void GetData()
	{
		int a = 4;
		System.out.println(a);
		System.out.println(this.a);
		int b = a+this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This_Feature_Demo TFD = new This_Feature_Demo();
		TFD.GetData();

	}

}
