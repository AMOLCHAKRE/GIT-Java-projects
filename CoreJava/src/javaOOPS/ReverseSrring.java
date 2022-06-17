package javaOOPS;

public class ReverseSrring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Reverse string operation";
		System.out.println(str);
		
		int testcount = str.length();
		String reverse = " ";
		for (int i=testcount-1;i>0;i--)
		{
			reverse = reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		
		System.out.println("------------------------");
	}

}
