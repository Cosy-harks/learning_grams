package runtime_dynamic_override_demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileV1 m1 = new MobileV1();
		MobileV2 m2 = new MobileV2();
		
		m1.displayMenu();
		m1.textMessaging();
		m1.calling();
		
		m2.displayMenu();
		m2.gaming();
		m2.socialApps();
		
		System.out.println(m2.toString());
		System.out.println(m2.hashCode());
	}

}
