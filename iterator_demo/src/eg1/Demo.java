package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		System.out.println("Before Deletion");
		System.out.println(hm);
		
		//error
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%4==0) {//using e.getKey
//				hm.remove(e.getKey());//using hm.remove
//			}
//		}
		
		
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		
		while(i.hasNext()) {
			Entry<Integer,String> e=i.next(); //read and post increment
			if(e.getKey()%4==0) {
				i.remove();
			}
		}
		
		
		System.out.println("After Deletion");
		System.out.println(hm);
		
		
	}

}


//Enumerator -> read from top to bottom
//Iterator -> read & remove from top to bottom
//ListIterator -> ...up & down









