package eg2;

public class Implementor implements Child, Child.Inner {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 of parent");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2 of child");
	}
	
	public void method3() {
		System.out.println("Method3 of implementor");
	}

	@Override
	public void innerMethod() {
		// TODO Auto-generated method stub
		System.out.println("InnerMethod of Child's Inner");
	}

}
