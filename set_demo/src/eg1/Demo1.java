package eg1;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		
		hs.add("HI");
		hs.add("There");
		hs.add("whats");
		hs.add("up");
		hs.add(null);
		hs.add("HI");
		hs.add("JAVA");
		hs.add("Hmm?");
		hs.add("HI");
		hs.add("null");
		hs.add(null);
		
		
		System.out.println(hs);
		
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.add("HI");
		lhs.add("There");
		lhs.add("whats");
		lhs.add("up");
		lhs.add(null);
		lhs.add("HI");
		lhs.add("JAVA");
		lhs.add("Hmm?");
		lhs.add("HI");
		lhs.add("null");
		lhs.add(null);
		
		
		System.out.println(lhs);
		
		
		//tree sort in reverse order
		Set<String> ts = new TreeSet<>(Collections.reverseOrder());
		
		ts.add("HI");
		ts.add("There");
		ts.add("whats");
		ts.add("up");
		//ts.add(null);
		ts.add("HI");
		ts.add("JAVA");
		ts.add("Hmm?");
		ts.add("HI");
		ts.add("null");
		//ts.add(null);
		
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("Hmm?"));
		System.out.println(ts);
		//for each loop used on unindexed lists
		for(String s:ts) {
			System.out.println(s);
		}
		ts.remove("JAVA");
		System.out.println(ts);
	}
	
	
	
	
	
	
	
	
}
