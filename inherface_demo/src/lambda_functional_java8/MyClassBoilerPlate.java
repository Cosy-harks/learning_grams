package lambda_functional_java8;

//till version 7
public class MyClassBoilerPlate implements Hello {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello java7");
	}
	
	public static void main(String[] args) {
		Hello f = new MyClassBoilerPlate();
		f.hello();
	}

}
