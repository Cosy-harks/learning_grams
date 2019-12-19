package eg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "Buy");
		hm.put(2, "Me");
		hm.put(13, "ay");
		hm.put(8, "river");
		hm.put(133, "!");
		hm.put(121, null);
		hm.put(311, null);
		hm.put(416, "Buy");
		
		System.out.println(hm);
		hm.put(311, "Update");
		System.out.println(hm);
		
		hm.put(10, "ayy");
		hm.put(20, "woo");
		hm.put(203, "ma");
		hm.put(18, "rier");
		hm.put(193, "?");
		hm.put(126, null);
		hm.put(211, null);
		hm.put(316, "Booy");
		System.out.println(hm);
		

		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(10, "ayy");
		lhm.put(20, "woo");
		lhm.put(203, "ma");
		lhm.put(18, "rier");
		lhm.put(193, "?");
		lhm.put(126, null);
		lhm.put(211, null);
		lhm.put(316, "Booy");
		System.out.println(lhm);
		

		Map<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Buy");
		tm.put(2, "Me");
		tm.put(13, "ay");
		tm.put(8, "river");
		//tm.put(null, "!");
		tm.put(121, null);
		tm.put(311, null);
		tm.put(416, "Buy");
		
		System.out.println(tm);
		
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(10, "ayy");
		ht.put(20, "woo");
		ht.put(203, "ma");
		ht.put(18, "rier");
		ht.put(193, "?");
		//ht.put(126, null);
		//ht.put(211, null);
		ht.put(316, "Booy");
		System.out.println(ht);
		
		System.out.println(ht.containsKey(10));

		System.out.println(ht.get(20));
		System.out.println(ht.containsValue("woo"));
		System.out.println(ht.containsValue("wo"));

		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		//More steps for programmer
		Set<Integer> s = ht.keySet();
		for(Integer i:s) {
			System.out.println("Key = "+i+" value is "+ht.get(i));
		}
		
		
		// Preferred
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key = "+e.getKey()+" value is "+e.getValue());
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
