package example1;

public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * RegEx - regular expression
		 * Pattern Matching Algorithm
		 * [] - represents expression
		 * {} - length
		 * ^ - not
		 * () - grouping
		 * [0-9]{3} - any three digits
		 * [a-z]{5,10} - any word min length 5, max length 10
		 * [A-Z]{1,} - min 1 uppercase letter and no max
		 * [^0-9] - apart from digits
		 *  other symbols +?. 
		 */
		
		
		String s="HeLL)) 123@ _HI ;P";
		
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));
		
		String s1="ASDFG1234P";
		
		if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		String u="+1-7895431234";
		if(u.matches("\\+1-[0-9]{10}")) {
			System.out.println("valid num");
		}else {
			System.out.println("invalid num");
		}
	}

}

// Explore on what :: operator is. java8 feature


