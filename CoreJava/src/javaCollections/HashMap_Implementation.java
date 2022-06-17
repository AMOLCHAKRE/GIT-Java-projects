package javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Key Value pair mechanism
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(0, "Amol");
		HM.put(1,"Tester");
		HM.put(2, "Welcome");
		HM.put(3, "Hello");
		HM.remove(4, "Hello");
		HM.put(3, "Nice");
		System.out.println(HM.get(3));
		
		System.out.println(HM.size());
		
		Set<?> set = HM.entrySet();
		Iterator<?> it = set.iterator();
		
		
		while (it.hasNext())
		{
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		

	}

}
