package coreJava_part_2;

public class StaticVariables {
	
	String name;  // These all are the Instance variable
	String address;
	static String city; // This is called as class variable
	static int i;
	
	static // This is called as static block
	{
		city = "Pune";
		i = 0;
	}
	
	StaticVariables(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
		public void GetAddress()
		{
			System.out.println(address+" "+name);
		}
		
		public static void GetCity()
		{
			System.out.println(city);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariables Obj = new StaticVariables("Ram", "Nadedcity");
		StaticVariables Obj1 = new StaticVariables("Shyam", "Karve nagar");
		StaticVariables Obj2 = new StaticVariables("Ghanshyam", "Gokhale nagar");
		Obj.GetAddress();
		Obj1.GetAddress();
		Obj2.GetAddress();
		StaticVariables.GetCity();
		Obj.address="Ram Nagar";
		
		
	}

}
