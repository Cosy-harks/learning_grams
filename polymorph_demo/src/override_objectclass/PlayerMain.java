package override_objectclass;

public class PlayerMain {
	public static void main(String[] args) {
		Player p1 = new Player("Me", 100);
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		
		Player p2=new Player("men", 101);
		System.out.println("p2 = " + p2);
		
		Player p3=new Player("Me", 100);
		System.out.println("p3 = " + p3);
		
		if(p1.equals(p3)) {
			System.out.println("Same");
		}else {
			System.out.println("diff");
		}
	}
}
