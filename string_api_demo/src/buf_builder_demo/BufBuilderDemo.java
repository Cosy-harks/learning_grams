package buf_builder_demo;

public class BufBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);
		sb.append(true).append(123.45).append("heyo");
		System.out.println(sb);
		sb.insert(2, "java");
		System.out.println(sb);
		sb.delete(7, 9);
		System.out.println(sb);
		sb.deleteCharAt(10);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		String s="madam";
		
		//inline object creation
		// we don't need that object after the check
		if(new StringBuilder(s).reverse().toString().equals(s)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		int x = 100;
		
		s=x+"mada1m";
		
		//inline object creation
		// we don't need that object after the check
		if(new StringBuilder(s).reverse().toString().equals(s)) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		
		
		
	}

}
