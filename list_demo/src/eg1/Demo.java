package eg1;

import java.util.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lis=new ArrayList();
		lis.add("heyy");
		lis.add(111);
		lis.add(1.21);
		lis.add(null);
		lis.add(true);
		lis.add("heyy");
		lis.add(22.3333);
		System.out.println(lis);
		
		
		List<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(null);
		al.add(10);
		al.add(10);
		al.add(1010111010);
		al.add(null);
		al.add(null);
		al.add(10);
		al.add(22);
		System.out.println(al);
		
		
		al.remove(5);
		al.add(2, 50);
		System.out.println(al);
		
		al.set(1, 2303);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(7));
		
		
		for(int i = 0; al.size()>i; i++) {
			System.out.println(al.get(i));
		}
		
		
		al.remove(new Integer(1000));
		System.out.println(al);
		
		while(al.remove(null)) {System.out.println("removed:"+true);}; //removes all null with boolean return
		System.out.println("removed:"+false);
		System.out.println(al);

		System.out.println(al.contains(10));
		
		
		
		
		
		
		
		
		
		
		
	}

}
