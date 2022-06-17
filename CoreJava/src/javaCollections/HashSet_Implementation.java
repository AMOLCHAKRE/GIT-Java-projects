package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet, TreeSet, LikedHashSet - This class implements Set interface
		//Set Interface does not allow to store duplicate value
		//In this interface there is no guarantee elements stored in sequential order...it would be in random
		
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(10);
		HS.add(52);
		HS.add(15);
		HS.add(12);
		HS.add(47);
		System.out.println(HS.remove(47));
		System.out.println(HS);
		System.out.println(HS.size());
		System.out.println(HS.isEmpty());
		
		//Iterator 
		
		Iterator<Integer> I=HS.iterator();
		
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		

	}

}
