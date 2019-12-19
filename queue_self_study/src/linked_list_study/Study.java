package linked_list_study;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lll = new LinkedList<>();
		lll.add("hi");
		lll.add("jay");
		lll.add("vi");
		lll.add("mmm");
		lll.add("Blah");
		lll.add("Shot");
		lll.add("WeiRd");
		lll.add(null);
		lll.add("hi");
		
		System.out.println(lll);
		
		Queue<String> qll = new LinkedList<>(lll);
		
		System.out.println(qll);
		
		qll.add("Me");
		System.out.println(qll);
		System.out.println(qll.element());
		qll.removeAll(lll);
		System.out.println(qll);
		
		
		Deque<String> dll = new LinkedList<>(qll);
		
		dll.add("Pie");
		dll.add("a Piece");
		dll.add("of");
		dll.add("Pen");
		dll.add("ellosh");
		
		System.out.println(dll);
		System.out.println(dll.pollFirst());
		System.out.println(dll.contains("Pen"));
		System.out.println(dll.getLast());
		System.out.println(dll.pop());
		dll.add("Pie");
		System.out.println(dll);
		
		
		
		
		
		
		
	}

}
