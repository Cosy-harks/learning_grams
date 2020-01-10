package list_eg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List generic1 = new Vector(); //10 units
		List generic2 = new ArrayList();// 10 units
		List generic3 = new LinkedList();// 0 units
		
		generic1.add("twelve"); // add String
		generic2.add(2934470239l); // add long
		generic1.add((Long)12l); // still runs with two different types
		generic3.addAll(generic1);
		for(int i = 0; i < 3029; i++) {
			Math.sin((double)i);
			switch(i%4) {
			case 0:
				generic2.add(Math.sin(((double)i)/10.0));
				break;
			case 1:
				generic2.add(Math.sin(((double)i)/10.0) + "");
				break;
			case 2:
				generic3.add((i/2%7), Math.sin(((double)i)/10.0));
				break;
			case 3:
				generic3.add(i/2, Math.sin(((double)i)/10.0) + "");
			default:
				generic1.add(generic3.get(2));
			}
		}
		
		System.out.println("Printing collections");
		System.out.println(generic1);
		System.out.println(generic2);
		System.out.println(generic3);
		
		long time = 25l;
		
		generic1.clear();
		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic1.add(System.currentTimeMillis());
		}
		System.out.println("generic Vector size: " + generic1.size());
		
		generic2.clear();
		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic2.add(System.currentTimeMillis());
		}
		System.out.println("generic ArrayList size: " + generic2.size());
		
		generic3.clear();
		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic3.add(System.currentTimeMillis());
		}
		System.out.println("generic LinkedList size: " + generic3.size());
		
		System.out.println("ArrayList is " + (generic2.size()-generic1.size())+
				" elements bigger than Vector after "+time+" milliseconds");
		System.out.println("LinkedList is " + (generic3.size()-generic2.size())+
				" elements bigger than ArrayList after "+time+" milliseconds");
		
		long t;
		for(t = System.currentTimeMillis(); generic1.size()>0;) {
			generic1.remove(0);
		}
		System.out.println("Vector deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic2.size()>0;) {
			generic2.remove(0);
		}
		System.out.println("ArrayList deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic3.size()>0;) {
			generic3.remove(0);
		}
		System.out.println("LinkedList deleting time: "+(System.currentTimeMillis()-t));
		
		//Part 2
		System.out.println("insert at end");
		generic1.clear();
		//generic1.add(0);
		for (t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic1.add(generic1.size(), System.currentTimeMillis());
		}
		System.out.println("generic Vector size: " + generic1.size());
		
		generic2.clear();
		for (t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic2.add(generic2.size(), System.currentTimeMillis());
		}
		System.out.println("generic ArrayList size: " + generic2.size());
		
		generic3.clear();
		for (t = System.currentTimeMillis()+time; System.currentTimeMillis()<t;) {
			generic3.add(generic3.size(), System.currentTimeMillis());
		}
		System.out.println("generic LinkedList size: " + generic3.size());
		
		System.out.println("ArrayList is " + (generic2.size()-generic1.size())+
				" elements bigger than Vector after "+time+" milliseconds");
		System.out.println("LinkedList is " + (generic3.size()-generic2.size())+
				" elements bigger than ArrayList after "+time+" milliseconds");
		
		for(t = System.currentTimeMillis(); generic1.size()>0;) {
			generic1.remove(generic1.size()/2);
		}
		System.out.println("Vector deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic2.size()>0;) {
			generic2.remove(generic2.size()/2);
		}
		System.out.println("ArrayList deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic3.size()>0;) {
			generic3.remove(generic3.size()/2);
		}
		System.out.println("LinkedList deleting time: "+(System.currentTimeMillis()-t));
	}
}
