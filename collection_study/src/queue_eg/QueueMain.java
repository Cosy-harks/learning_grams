package queue_eg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue generic2 = new PriorityQueue();// ? units
		Queue generic3 = new LinkedList();// 0 units
		
		generic2.add(29344702l); // add long
		generic3.addAll(generic2);
		
		for(int i = 0; i < 3029; i++) {
			Math.sin((double)i);
			switch(i%4) {
			case 0:
				generic2.add((long)Math.sin(((double)i)*100.0));
				break;
			case 1:
				generic2.add((long)Math.sin(((double)i)*100.0));
				break;
			case 2:
				generic3.add((i/2%7));
				break;
			case 3:
				generic3.add(i/2 + "");
				break;
			default:
			}
		}
		
		System.out.println("Printing collections");
		System.out.println(generic2);
		System.out.println(generic3);
		
		long time = 25l;
		
//		generic1.clear();
//		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
//			generic1.add(System.currentTimeMillis());
//		}
//		System.out.println("generic Vector size: " + generic1.size());
		
		generic2.clear();
		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic2.add(System.currentTimeMillis());
		}
		System.out.println("generic PriorityQueue size: " + generic2.size());
		
		generic3.clear();
		for (long t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic3.add(System.currentTimeMillis());
		}
		System.out.println("generic LinkedList size: " + generic3.size());
		
//		System.out.println("ArrayList is " + (generic2.size()-generic1.size())+
//				" elements bigger than Vector after "+time+" milliseconds");
		System.out.println("LinkedList is " + (generic3.size()-generic2.size())+
				" elements bigger than PriorityQueue after "+time+" milliseconds");
		
		long t;
//		for(t = System.currentTimeMillis(); generic1.size()>0;) {
//			generic1.remove(0);
//		}
//		System.out.println("Vector deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic2.size()>0;) {
			generic2.poll();
		}
		System.out.println("PriorityQueue deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic3.size()>0;) {
			generic3.poll();
		}
		System.out.println("LinkedList deleting time: "+(System.currentTimeMillis()-t));
		
		//Part 2
		System.out.println("insert at end");
//		//generic1.clear();
//		//generic1.add(0);
//		for (t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
//			generic1.add(generic1.size(), System.currentTimeMillis());
//		}
//		System.out.println("generic Vector size: " + generic1.size());
		
		generic2.clear();
		for (t = System.currentTimeMillis() +time; System.currentTimeMillis()<t;) {
			generic2.add(System.currentTimeMillis());
		}
		System.out.println("generic PriorityQueue size: " + generic2.size());
		
		generic3.clear();
		for (t = System.currentTimeMillis()+time; System.currentTimeMillis()<t;) {
			generic3.add(System.currentTimeMillis());
		}
		System.out.println("generic LinkedList size: " + generic3.size());
		
//		System.out.println("ArrayList is " + (generic2.size()-generic1.size())+
//				" elements bigger than Vector after "+time+" milliseconds");
		System.out.println("LinkedList is " + (generic3.size()-generic2.size())+
				" elements bigger than PriorityQueue after "+time+" milliseconds");
		
//		for(t = System.currentTimeMillis(); generic1.size()>0;) {
//			generic1.remove(generic1.size()/2);
//		}
//		System.out.println("Vector deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic2.size()>0;) {
			generic2.poll();
		}
		System.out.println("PriorityQueue deleting time: "+(System.currentTimeMillis()-t));
		
		for(t = System.currentTimeMillis(); generic3.size()>0;) {
			generic3.poll();
		}
		System.out.println("LinkedList deleting time: "+(System.currentTimeMillis()-t));

	}

}
