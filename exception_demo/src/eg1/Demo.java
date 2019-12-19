package eg1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int res=0;
		String s=null;
		try {
			System.out.println(s.length());
			res =a/b;
		}catch(ArithmeticException e) {
			System.out.println("Cannot div by 0.");
		}catch(NullPointerException e){
			System.out.println("Empty String");
		}finally {
			System.out.println(res);
		}
		
		System.out.println("print me too");
	}

}
