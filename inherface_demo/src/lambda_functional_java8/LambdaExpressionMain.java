package lambda_functional_java8;

public class LambdaExpressionMain {
	
	public static void main(String[] args) {
		//only abled with functional interfaces
		Hello f=()->{
			System.out.println("Hello from Lambda");
		};//in-line object creation
		f.hello();
		
		Hello f1=()->{
			System.out.println("Hello from Lambda again");
		};
		f1.hello();
		
		f=()->{//reassignment of object f
			System.out.println("Boo");
		};
		f.hello();
		
		
		
		
		//parameter
		Functional2 f2=(n)->{
			System.out.println("Hello " + n);
		};
		
		f2.hey("Mike");
		
		
		
		
		//with return & parameter
		Sum s=(a, v)->{
			return a+v;
		};
		
		System.out.println(s.add(12, 4));
		System.out.println(s.add(142, 24));

		
	}
}
