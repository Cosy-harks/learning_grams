package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(null);
		al.add(12);
		al.add(10);
		al.add(1010111010);
		al.add(null);
		al.add(null);
		al.add(10);
		al.add(22);
		System.out.println("al = " + al);
		
		List<Integer> ll=new LinkedList<>(al);

		System.out.println("ll = " + ll);
		ll.addAll(al); //union
		System.out.println("ll = " + ll);
		ll.clear();
		System.out.println("ll = " + ll);
		ll.add(10);
		ll.add(100);
		ll.add(11);
		ll.add(10);
		System.out.println("ll = " + ll);
		
		//al.retainAll(ll); //intersection
		al.removeAll(ll); //A-B
		System.out.println("al = " + al);
		
		
		//Collections.sort(ll); //Ascending
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("ll = " + ll);
		
		Collections.shuffle(ll);
		System.out.println("ll = " + ll);
		Collections.reverse(ll);
		System.out.println("ll = " + ll);
		
		ll.add(113);
		ll.add(120);
		ll.add(11);
		ll.add(12);
		Collections.sort(ll);
		System.out.println("ll = " + ll);
		System.out.println(Collections.binarySearch(ll, 1212));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
