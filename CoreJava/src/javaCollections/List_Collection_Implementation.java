package javaCollections;

import java.util.ArrayList;

public class List_Collection_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList accept duplicate data
		// ArrayList, LikedList, Vector - used for implementing List Interface
		//Array have fixed size where ArrayList can grow dynamically 
		//In ArrayList we can access and insert any value at any index 
		
		ArrayList<String> AL = new ArrayList<String>();
		AL.add(0, "Tester");
		AL.add(1, "Amol");
		AL.add("ArrayList");
		AL.add("main");
		AL.add("Remove");
		AL.remove(4);
		AL.add("Remove");
		System.out.println(AL.contains("Tester"));
		System.out.println(AL.get(0));
		System.out.println(AL);
		System.out.println(AL.indexOf("Amol"));
		System.out.println(AL.isEmpty());
		System.out.println(AL.size());
		

	}

}
